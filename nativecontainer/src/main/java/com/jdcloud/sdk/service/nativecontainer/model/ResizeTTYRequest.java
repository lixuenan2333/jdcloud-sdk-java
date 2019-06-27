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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nativecontainer.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 调整TTY大小

 */
public class ResizeTTYRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tty row
     * Required:true
     */
    @Required
    private Integer height;

    /**
     * tty column
     * Required:true
     */
    @Required
    private Integer width;

    /**
     * exec ID
     */
    private String execId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Container ID
     * Required:true
     */
    @Required
    private String containerId;


    /**
     * get tty row
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set tty row
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get tty column
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set tty column
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get exec ID
     *
     * @return
     */
    public String getExecId() {
        return execId;
    }

    /**
     * set exec ID
     *
     * @param execId
     */
    public void setExecId(String execId) {
        this.execId = execId;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Container ID
     *
     * @return
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }


    /**
     * set tty row
     *
     * @param height
     */
    public ResizeTTYRequest height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set tty column
     *
     * @param width
     */
    public ResizeTTYRequest width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set exec ID
     *
     * @param execId
     */
    public ResizeTTYRequest execId(String execId) {
        this.execId = execId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ResizeTTYRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public ResizeTTYRequest containerId(String containerId) {
        this.containerId = containerId;
        return this;
    }


}