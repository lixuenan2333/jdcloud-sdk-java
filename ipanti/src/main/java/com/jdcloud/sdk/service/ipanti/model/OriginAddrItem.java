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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * originAddrItem
 */
public class OriginAddrItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回源ip
     */
    private String ip;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 是否为京东云内公网ip
     */
    private Boolean inJdCloud;


    /**
     * get 回源ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 回源ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 权重
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 权重
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * get 是否为京东云内公网ip
     *
     * @return
     */
    public Boolean getInJdCloud() {
        return inJdCloud;
    }

    /**
     * set 是否为京东云内公网ip
     *
     * @param inJdCloud
     */
    public void setInJdCloud(Boolean inJdCloud) {
        this.inJdCloud = inJdCloud;
    }


    /**
     * set 回源ip
     *
     * @param ip
     */
    public OriginAddrItem ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 权重
     *
     * @param weight
     */
    public OriginAddrItem weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set 是否为京东云内公网ip
     *
     * @param inJdCloud
     */
    public OriginAddrItem inJdCloud(Boolean inJdCloud) {
        this.inJdCloud = inJdCloud;
        return this;
    }


}