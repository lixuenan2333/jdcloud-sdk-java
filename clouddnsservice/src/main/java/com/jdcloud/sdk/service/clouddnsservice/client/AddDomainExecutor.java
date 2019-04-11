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
 * 域名
 * 云解析OpenAPI域名接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.clouddnsservice.model.AddDomainResponse;

/**
 * 添加主域名  
如何添加免费域名，详细情况请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/domainadd&quot;&gt;文档&lt;/a&gt;
添加收费域名，请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/purchase-process&quot;&gt;文档&lt;/a&gt;，
添加收费域名前，请确保用户的京东云账户有足够的资金支付，Openapi接口回返回订单号，可以用此订单号向计费系统查阅详情。

 */
class AddDomainExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/domainAdd";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return AddDomainResponse.class;
    }
}
