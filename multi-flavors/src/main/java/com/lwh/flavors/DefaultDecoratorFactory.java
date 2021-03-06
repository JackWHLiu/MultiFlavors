/*
 * Copyright (C) 2019 The JackKnife Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lwh.flavors;

import com.lwh.flavors.interfaces.DecoratorFactory;
import com.lwh.flavors.interfaces.IDifference;

public class DefaultDecoratorFactory implements DecoratorFactory {

    @Override
    public <C extends IDifference, D extends IDifference>
    D newDecorator(C component, Class<C> componentClazz) {
        return null;
    }

    @Override
    public Class<? extends IDifference> getDecoratorClass() {
        return null;
    }
}
