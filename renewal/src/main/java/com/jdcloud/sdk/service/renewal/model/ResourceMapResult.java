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
 * JDCLOUD Renewal API v2
 * API related to Renewal
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.renewal.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * resourceMapResult
 */
public class ResourceMapResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 该产品线的已过期资源信息
     */
    private List<QueryExpiredResourceResultVo> resourceList;

    /**
     * 该产品线的已过期资源总数
     */
    private Integer totalNumber;

    /**
     * 该产品线的已过期资源ID信息
     */
    private List<String> resourceIdList;


    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 该产品线的已过期资源信息
     *
     * @return
     */
    public List<QueryExpiredResourceResultVo> getResourceList() {
        return resourceList;
    }

    /**
     * set 该产品线的已过期资源信息
     *
     * @param resourceList
     */
    public void setResourceList(List<QueryExpiredResourceResultVo> resourceList) {
        this.resourceList = resourceList;
    }

    /**
     * get 该产品线的已过期资源总数
     *
     * @return
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * set 该产品线的已过期资源总数
     *
     * @param totalNumber
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * get 该产品线的已过期资源ID信息
     *
     * @return
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    /**
     * set 该产品线的已过期资源ID信息
     *
     * @param resourceIdList
     */
    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }


    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public ResourceMapResult serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 该产品线的已过期资源信息
     *
     * @param resourceList
     */
    public ResourceMapResult resourceList(List<QueryExpiredResourceResultVo> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    /**
     * set 该产品线的已过期资源总数
     *
     * @param totalNumber
     */
    public ResourceMapResult totalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * set 该产品线的已过期资源ID信息
     *
     * @param resourceIdList
     */
    public ResourceMapResult resourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }


    /**
     * add item to 该产品线的已过期资源信息
     *
     * @param resourceList
     */
    public void addResourceList(QueryExpiredResourceResultVo resourceList) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceList);
    }

    /**
     * add item to 该产品线的已过期资源ID信息
     *
     * @param resourceIdList
     */
    public void addResourceIdList(String resourceIdList) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdList);
    }

}