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

package com.jdcloud.sdk.service.sop.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * getSecurityTokenInfo
 */
public class GetSecurityTokenInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作保护验证方式：1-短信,2-邮箱,3-MFA
     * Required:true
     */
    @Required
    private Integer type;

    /**
     * 验证码
     * Required:true
     */
    @Required
    private String code;

    /**
     * 操作action serviceName:actionName
     * Required:true
     */
    @Required
    private String action;

    /**
     * 令牌有效期，单位秒，OpenAPI第三方MFA方式验证有效，默认短信、邮箱token有效期300秒，MFA有效期30秒
     */
    private Integer durationSeconds;


    /**
     * get 操作保护验证方式：1-短信,2-邮箱,3-MFA
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 操作保护验证方式：1-短信,2-邮箱,3-MFA
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 验证码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 验证码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get 操作action serviceName:actionName
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 令牌有效期，单位秒，OpenAPI第三方MFA方式验证有效，默认短信、邮箱token有效期300秒，MFA有效期30秒
     *
     * @return
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * set 令牌有效期，单位秒，OpenAPI第三方MFA方式验证有效，默认短信、邮箱token有效期300秒，MFA有效期30秒
     *
     * @param durationSeconds
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }


    /**
     * set 操作保护验证方式：1-短信,2-邮箱,3-MFA
     *
     * @param type
     */
    public GetSecurityTokenInfo type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 验证码
     *
     * @param code
     */
    public GetSecurityTokenInfo code(String code) {
        this.code = code;
        return this;
    }

    /**
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public GetSecurityTokenInfo action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 令牌有效期，单位秒，OpenAPI第三方MFA方式验证有效，默认短信、邮箱token有效期300秒，MFA有效期30秒
     *
     * @param durationSeconds
     */
    public GetSecurityTokenInfo durationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }


}