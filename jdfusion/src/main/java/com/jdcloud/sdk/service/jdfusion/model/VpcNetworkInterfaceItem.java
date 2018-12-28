/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * vpcNetworkInterfaceItem
 */
public class VpcNetworkInterfaceItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * netInterface
     */
    private NetInterfaceInfo netInterface;


    /**
     * get netInterface
     *
     * @return
     */
    public NetInterfaceInfo getNetInterface() {
        return netInterface;
    }

    /**
     * set netInterface
     *
     * @param netInterface
     */
    public void setNetInterface(NetInterfaceInfo netInterface) {
        this.netInterface = netInterface;
    }


    /**
     * set netInterface
     *
     * @param netInterface
     */
    public VpcNetworkInterfaceItem netInterface(NetInterfaceInfo netInterface) {
        this.netInterface = netInterface;
        return this;
    }


}