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
 * Send-Message-Related-APIs
 * 短信发送相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 拉取单个手机短信状态
 */
public class PullMtMsgByMobileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用Id
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 手机号码
     * Required:true
     */
    @Required
    private String phone;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 应用Id
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用Id
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 手机号码
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机号码
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * set 应用Id
     *
     * @param appId
     */
    public PullMtMsgByMobileRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 手机号码
     *
     * @param phone
     */
    public PullMtMsgByMobileRequest phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public PullMtMsgByMobileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}