/*
 * Copyright 2015 Open Networking Laboratory
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
package org.onosproject.provider.lldp.impl;

import org.onosproject.mastership.MastershipService;
import org.onosproject.net.link.LinkProviderService;
import org.onosproject.net.packet.PacketService;

/**
 * Shared context for use by link discovery.
 */
public interface DiscoveryContext {

    /**
     * Returns the shared mastership service reference.
     *
     * @return mastership service
     */
    MastershipService mastershipService();

    /**
     * Returns the shared link provider service reference.
     *
     * @return link provider service
     */
    LinkProviderService providerService();

    /**
     * Returns the shared packet service reference.
     *
     * @return packet service
     */
    PacketService packetService();

    /**
     * Returns the probe rate in millis.
     *
     * @return probe rate
     */
    long probeRate();

    /**
     * Returns the max stale link age in millis.
     *
     * @return stale link age
     */
    long staleLinkAge();

    /**
     * Indicates whether to emit BDDP.
     *
     * @return true to emit BDDP
     */
    boolean useBDDP();
}
