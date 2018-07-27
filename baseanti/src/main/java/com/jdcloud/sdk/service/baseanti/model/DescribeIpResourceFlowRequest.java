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
 * DDoS基础防护相关接口
 * DDoS基础防护相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.baseanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询公网Ip的监控流量
 */
public class DescribeIpResourceFlowRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String endTime;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 公网ip
     * Required:true
     */
    @Required
    private String ip;


    /**
     * get 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * get 公网ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 公网ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * set 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public DescribeIpResourceFlowRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeIpResourceFlowRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 公网ip
     *
     * @param ip
     */
    public DescribeIpResourceFlowRequest ip(String ip) {
        this.ip = ip;
        return this;
    }


}