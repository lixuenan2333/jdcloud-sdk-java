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
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 删除域名头参数请求消息体
 */
public class DeleteHeaderReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 头参数名
     */
    private String headerName;

    /**
     * 头参数类型
     */
    private String headerType;


    /**
     * get 头参数名
     *
     * @return
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * set 头参数名
     *
     * @param headerName
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * get 头参数类型
     *
     * @return
     */
    public String getHeaderType() {
        return headerType;
    }

    /**
     * set 头参数类型
     *
     * @param headerType
     */
    public void setHeaderType(String headerType) {
        this.headerType = headerType;
    }


    /**
     * set 头参数名
     *
     * @param headerName
     */
    public DeleteHeaderReq headerName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * set 头参数类型
     *
     * @param headerType
     */
    public DeleteHeaderReq headerType(String headerType) {
        this.headerType = headerType;
        return this;
    }


}