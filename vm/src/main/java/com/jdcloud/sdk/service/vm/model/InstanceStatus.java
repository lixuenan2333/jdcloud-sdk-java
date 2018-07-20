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

package com.jdcloud.sdk.service.vm.model;


/**
 * instanceStatus
 */
public class InstanceStatus  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云主机ID
     */
    private String instanceId;

    /**
     * 云主机状态
     */
    private String status;


    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 云主机状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云主机状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public InstanceStatus instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 云主机状态
     *
     * @param status
     */
    public InstanceStatus status(String status) {
        this.status = status;
        return this;
    }


}