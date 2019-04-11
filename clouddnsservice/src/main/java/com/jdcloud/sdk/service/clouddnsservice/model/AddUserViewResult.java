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
 * 解析记录
 * 云解析OpenAPI自定义线路接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.service.clouddnsservice.model.Userview;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加主域名的自定义解析线路
 */
public class AddUserViewResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 添加成功后返回的自定义线路的结构
     */
    private Userview data;


    /**
     * get 添加成功后返回的自定义线路的结构
     *
     * @return
     */
    public Userview getData() {
        return data;
    }

    /**
     * set 添加成功后返回的自定义线路的结构
     *
     * @param data
     */
    public void setData(Userview data) {
        this.data = data;
    }


    /**
     * set 添加成功后返回的自定义线路的结构
     *
     * @param data
     */
    public AddUserViewResult data(Userview data) {
        this.data = data;
        return this;
    }


}