/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.powsybl.loadflow;

import com.powsybl.commons.PowsyblException;
import com.powsybl.commons.Versionable;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
public interface LoadFlow extends Versionable {

    /**
     * @deprecated Use CompletableFuture<LoadFlowResult> run(String workingStateId, LoadFlow
     */
    @Deprecated
    default LoadFlowResult run(LoadFlowParameters parameters) throws Exception {
        throw new UnsupportedOperationException("deprecated");
    }

    /**
     * @deprecated Use LoadFlowResult run(LoadFlowParameters parameters) instead
     */
    @Deprecated
    default LoadFlowResult run() throws Exception {
        throw new UnsupportedOperationException("deprecated");
    }

    /**
     * @deprecated Use CompletableFuture<LoadFlowResult> run(String workingStateId, LoadFlow
     */
    @Deprecated
    default CompletableFuture<LoadFlowResult> runAsync(String workingStateId, LoadFlowParameters parameters) {
        return run(workingStateId, parameters);
    }

    default CompletableFuture<LoadFlowResult> run(String workingStateId, LoadFlowParameters parameters) {
        try {
            return CompletableFuture.completedFuture(run(parameters));
        } catch (Exception e) {
            throw new PowsyblException(e);
        }
    }
}
