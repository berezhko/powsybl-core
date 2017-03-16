/**
 * Copyright (c) 2016, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.computation.script

import eu.itesla_project.computation.ComputationManager
import org.codehaus.groovy.control.CompilerConfiguration

import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
class GroovyScripts {

    static void run(Path file, ComputationManager computationManager) {
        run(file, computationManager, null)
    }

    static void run(Path file, ComputationManager computationManager, Writer out) {
        run(file, computationManager, new Binding(), out)
    }

    static void run(Reader codeReader, ComputationManager computationManager, Writer out) {
        run(codeReader, computationManager, new Binding(), out)
    }

    static void run(Path file, ComputationManager computationManager, Binding binding, Writer out) {
        file.withReader(StandardCharsets.UTF_8.name(), { reader ->
            run(reader, computationManager, binding, out)
        })
    }

    static void run(Reader codeReader, ComputationManager computationManager, Binding binding, Writer out) {
        run(codeReader, computationManager, binding, ServiceLoader.load(GroovyScriptExtension.class), out)
    }

    static void run(Reader codeReader, ComputationManager computationManager, Iterable<GroovyScriptExtension> extensions, Writer out) {
        run(codeReader, computationManager, new Binding(), extensions, out)
    }

    static void run(Reader codeReader, ComputationManager computationManager, Binding binding, Iterable<GroovyScriptExtension> extensions, Writer out) {
        assert codeReader
        assert computationManager
        assert extensions != null

        CompilerConfiguration conf = new CompilerConfiguration()

        if (out != null) {
            binding.setProperty("out", out)
        }

        // load extensions
        extensions.forEach { it.load(binding, computationManager) }

        GroovyShell shell = new GroovyShell(binding, conf)
        shell.evaluate(codeReader)
    }
}