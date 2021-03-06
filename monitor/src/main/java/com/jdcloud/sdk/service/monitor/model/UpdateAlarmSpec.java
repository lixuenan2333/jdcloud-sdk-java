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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * updateAlarmSpec
 */
public class UpdateAlarmSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通知联系人
     */
    private List<BaseContact> contacts;

    /**
     * rule
     * Required:true
     */
    @Required
    private BaseRule rule;

    /**
     * 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     */
    private String webHookContent;

    /**
     * webHook协议
     */
    private String webHookProtocol;

    /**
     * 回调secret，用户请求签名，防伪造
     */
    private String webHookSecret;

    /**
     * 回调url
     */
    private String webHookUrl;


    /**
     * get 通知联系人
     *
     * @return
     */
    public List<BaseContact> getContacts() {
        return contacts;
    }

    /**
     * set 通知联系人
     *
     * @param contacts
     */
    public void setContacts(List<BaseContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * get rule
     *
     * @return
     */
    public BaseRule getRule() {
        return rule;
    }

    /**
     * set rule
     *
     * @param rule
     */
    public void setRule(BaseRule rule) {
        this.rule = rule;
    }

    /**
     * get 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @return
     */
    public String getWebHookContent() {
        return webHookContent;
    }

    /**
     * set 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @param webHookContent
     */
    public void setWebHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
    }

    /**
     * get webHook协议
     *
     * @return
     */
    public String getWebHookProtocol() {
        return webHookProtocol;
    }

    /**
     * set webHook协议
     *
     * @param webHookProtocol
     */
    public void setWebHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
    }

    /**
     * get 回调secret，用户请求签名，防伪造
     *
     * @return
     */
    public String getWebHookSecret() {
        return webHookSecret;
    }

    /**
     * set 回调secret，用户请求签名，防伪造
     *
     * @param webHookSecret
     */
    public void setWebHookSecret(String webHookSecret) {
        this.webHookSecret = webHookSecret;
    }

    /**
     * get 回调url
     *
     * @return
     */
    public String getWebHookUrl() {
        return webHookUrl;
    }

    /**
     * set 回调url
     *
     * @param webHookUrl
     */
    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }


    /**
     * set 通知联系人
     *
     * @param contacts
     */
    public UpdateAlarmSpec contacts(List<BaseContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set rule
     *
     * @param rule
     */
    public UpdateAlarmSpec rule(BaseRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * set 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @param webHookContent
     */
    public UpdateAlarmSpec webHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
        return this;
    }

    /**
     * set webHook协议
     *
     * @param webHookProtocol
     */
    public UpdateAlarmSpec webHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
        return this;
    }

    /**
     * set 回调secret，用户请求签名，防伪造
     *
     * @param webHookSecret
     */
    public UpdateAlarmSpec webHookSecret(String webHookSecret) {
        this.webHookSecret = webHookSecret;
        return this;
    }

    /**
     * set 回调url
     *
     * @param webHookUrl
     */
    public UpdateAlarmSpec webHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
        return this;
    }


    /**
     * add item to 通知联系人
     *
     * @param contact
     */
    public void addContact(BaseContact contact) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contact);
    }

}