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
 * CloudMonitor
 * 用于对云监控的支持
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;


/**
 * devicePageVo
 */
public class DevicePageVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Edge唯一标识
     */
    private String uuid;

    /**
     * IoT Hub实例唯一标识
     */
    private String instanceId;

    /**
     * 资源唯一标识
     */
    private String resourceId;

    /**
     * Edge编号
     */
    private String edgeId;

    /**
     * Edge显示名称
     */
    private String edgeName;

    /**
     * Edge状态
     */
    private String edgeState;

    /**
     * 物模型编号
     */
    private String omId;

    /**
     * 物模型名称
     */
    private String omName;

    /**
     * 最后在线时间
     */
    private String lastOnlineTime;


    /**
     * get Edge唯一标识
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set Edge唯一标识
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get IoT Hub实例唯一标识
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set IoT Hub实例唯一标识
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 资源唯一标识
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源唯一标识
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get Edge编号
     *
     * @return
     */
    public String getEdgeId() {
        return edgeId;
    }

    /**
     * set Edge编号
     *
     * @param edgeId
     */
    public void setEdgeId(String edgeId) {
        this.edgeId = edgeId;
    }

    /**
     * get Edge显示名称
     *
     * @return
     */
    public String getEdgeName() {
        return edgeName;
    }

    /**
     * set Edge显示名称
     *
     * @param edgeName
     */
    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
    }

    /**
     * get Edge状态
     *
     * @return
     */
    public String getEdgeState() {
        return edgeState;
    }

    /**
     * set Edge状态
     *
     * @param edgeState
     */
    public void setEdgeState(String edgeState) {
        this.edgeState = edgeState;
    }

    /**
     * get 物模型编号
     *
     * @return
     */
    public String getOmId() {
        return omId;
    }

    /**
     * set 物模型编号
     *
     * @param omId
     */
    public void setOmId(String omId) {
        this.omId = omId;
    }

    /**
     * get 物模型名称
     *
     * @return
     */
    public String getOmName() {
        return omName;
    }

    /**
     * set 物模型名称
     *
     * @param omName
     */
    public void setOmName(String omName) {
        this.omName = omName;
    }

    /**
     * get 最后在线时间
     *
     * @return
     */
    public String getLastOnlineTime() {
        return lastOnlineTime;
    }

    /**
     * set 最后在线时间
     *
     * @param lastOnlineTime
     */
    public void setLastOnlineTime(String lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }


    /**
     * set Edge唯一标识
     *
     * @param uuid
     */
    public DevicePageVo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set IoT Hub实例唯一标识
     *
     * @param instanceId
     */
    public DevicePageVo instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 资源唯一标识
     *
     * @param resourceId
     */
    public DevicePageVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set Edge编号
     *
     * @param edgeId
     */
    public DevicePageVo edgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }

    /**
     * set Edge显示名称
     *
     * @param edgeName
     */
    public DevicePageVo edgeName(String edgeName) {
        this.edgeName = edgeName;
        return this;
    }

    /**
     * set Edge状态
     *
     * @param edgeState
     */
    public DevicePageVo edgeState(String edgeState) {
        this.edgeState = edgeState;
        return this;
    }

    /**
     * set 物模型编号
     *
     * @param omId
     */
    public DevicePageVo omId(String omId) {
        this.omId = omId;
        return this;
    }

    /**
     * set 物模型名称
     *
     * @param omName
     */
    public DevicePageVo omName(String omName) {
        this.omName = omName;
        return this;
    }

    /**
     * set 最后在线时间
     *
     * @param lastOnlineTime
     */
    public DevicePageVo lastOnlineTime(String lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }


}