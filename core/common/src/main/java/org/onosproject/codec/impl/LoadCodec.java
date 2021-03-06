/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.codec.impl;

import org.onosproject.codec.CodecContext;
import org.onosproject.codec.JsonCodec;
import org.onosproject.net.statistic.Load;

import com.fasterxml.jackson.databind.node.ObjectNode;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Codec for the Load class.
 */
public class LoadCodec extends JsonCodec<Load> {

    private static final String RATE = "rate";
    private static final String LATEST = "latest";
    private static final String VALID = "valid";
    private static final String TIME = "time";

    @Override
    public ObjectNode encode(Load load, CodecContext context) {
        checkNotNull(load, "Load cannot be null");
        return context.mapper().createObjectNode()
                .put(RATE, load.rate())
                .put(LATEST, load.latest())
                .put(VALID, load.isValid())
                .put(TIME, load.time());
    }
}
