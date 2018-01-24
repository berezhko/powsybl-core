/**
 * Copyright (c) 2018, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.powsybl.commons.extensions;

/**
 * @author Mathieu Bague <mathieu.bague@rte-france.com>
 */
public interface ExtensionSerializer<T extends Extendable, E extends Extension<T>> {

    String getExtensionName();

    String getCategoryName();

    Class<? super E> getExtensionClass();
}