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

package com.jdcloud.sdk.service.baseanti.model;


/**
 * ipSafetyInfo
 */
public class IpSafetyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网 IP 地址
     */
    private String ip;

    /**
     * 安全状态, 0-&gt;安全, 1-&gt;清洗, 2-&gt;黑洞
     */
    private Integer safetyStatus;

    /**
     * 地域编码
     */
    private String region;

    /**
     * 黑洞阈值, 单位 bps
     */
    private Long blackHoleThreshold;

    /**
     * 触发清洗的流量速率, 单位 bps
     */
    private Long cleanThresholdBps;

    /**
     * 触发清洗的包速率, 单位 pps
     */
    private Long cleanThresholdPps;


    /**
     * get 公网 IP 地址
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 安全状态, 0-&gt;安全, 1-&gt;清洗, 2-&gt;黑洞
     *
     * @return
     */
    public Integer getSafetyStatus() {
        return safetyStatus;
    }

    /**
     * set 安全状态, 0-&gt;安全, 1-&gt;清洗, 2-&gt;黑洞
     *
     * @param safetyStatus
     */
    public void setSafetyStatus(Integer safetyStatus) {
        this.safetyStatus = safetyStatus;
    }

    /**
     * get 地域编码
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域编码
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 黑洞阈值, 单位 bps
     *
     * @return
     */
    public Long getBlackHoleThreshold() {
        return blackHoleThreshold;
    }

    /**
     * set 黑洞阈值, 单位 bps
     *
     * @param blackHoleThreshold
     */
    public void setBlackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
    }

    /**
     * get 触发清洗的流量速率, 单位 bps
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 触发清洗的流量速率, 单位 bps
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 触发清洗的包速率, 单位 pps
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 触发清洗的包速率, 单位 pps
     *
     * @param cleanThresholdPps
     */
    public void setCleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
    }


    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public IpSafetyInfo ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 安全状态, 0-&gt;安全, 1-&gt;清洗, 2-&gt;黑洞
     *
     * @param safetyStatus
     */
    public IpSafetyInfo safetyStatus(Integer safetyStatus) {
        this.safetyStatus = safetyStatus;
        return this;
    }

    /**
     * set 地域编码
     *
     * @param region
     */
    public IpSafetyInfo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 黑洞阈值, 单位 bps
     *
     * @param blackHoleThreshold
     */
    public IpSafetyInfo blackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
        return this;
    }

    /**
     * set 触发清洗的流量速率, 单位 bps
     *
     * @param cleanThresholdBps
     */
    public IpSafetyInfo cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 触发清洗的包速率, 单位 pps
     *
     * @param cleanThresholdPps
     */
    public IpSafetyInfo cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }


}