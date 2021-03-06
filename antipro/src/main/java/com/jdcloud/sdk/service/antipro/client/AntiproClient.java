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
 * 京东云DDoS防护包相关接口
 * 京东云DDoS防护包相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.antipro.model.CreateInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.CreateInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.CreateInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.DeleteProtectedIpRequest;
import com.jdcloud.sdk.service.antipro.model.DeleteProtectedIpResponse;
import com.jdcloud.sdk.service.antipro.client.DeleteProtectedIpExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.AddProtectedIpRequest;
import com.jdcloud.sdk.service.antipro.model.AddProtectedIpResponse;
import com.jdcloud.sdk.service.antipro.client.AddProtectedIpExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeIpMonitorFlowRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeIpMonitorFlowResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeIpMonitorFlowExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeCpsIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeCpsIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeCpsIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeGeoAreasRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeGeoAreasResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeGeoAreasExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackStatisticsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackStatisticsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackStatisticsExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackSourceRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackSourceResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackSourceExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionOutlineRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionOutlineResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectionOutlineExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionRuleRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionRuleResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectionRuleExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceNameRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceNameResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyInstanceNameExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectedIpListRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectedIpListResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectedIpListExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackLogsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackLogsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackLogsExecutor;
import com.jdcloud.sdk.service.antipro.model.CheckInstanceNameRequest;
import com.jdcloud.sdk.service.antipro.model.CheckInstanceNameResponse;
import com.jdcloud.sdk.service.antipro.client.CheckInstanceNameExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackTypeCountRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackTypeCountResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackTypeCountExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyProtectionRuleRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyProtectionRuleResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyProtectionRuleExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeElasticIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeElasticIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeElasticIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeOperationRecordsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeOperationRecordsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeOperationRecordsExecutor;

/**
 * antiproClient
 */
public class AntiproClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.1.1";
    public final static String DefaultEndpoint = "antipro.jdcloud-api.com";
    public final static String ServiceName = "antipro";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private AntiproClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 创建防护包实例, 当前支持区域: 华北-北京, 华东-宿迁, 华东-上海
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws JdcloudSdkException {
        return new CreateInstanceExecutor().client(this).execute(request);
    }

    /**
     * 删除防护包防护 IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteProtectedIpResponse deleteProtectedIp(DeleteProtectedIpRequest request) throws JdcloudSdkException {
        return new DeleteProtectedIpExecutor().client(this).execute(request);
    }

    /**
     * 查询防护包实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 添加防护包防护 IP.
- 防护包仅能防护防护包实例所在区域的公网 IP, 且该公网 IP 未被其他防护包防护, 如果已经被其他防护包防护, 请先调用删除防护包防护 IP 接口删除防护 IP
- 防护包可添加的防护 IP 个数小于等于防护包的可防护 IP 数量减去已防护的 IP 数量
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeelasticipresources&quot;&gt;describeElasticIpResources&lt;/a&gt; 接口查询防护包可防护的弹性公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describecpsipresources&quot;&gt;describeCpsIpResources&lt;/a&gt; 接口查询防护包可防护的云物理服务器公网 IP

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddProtectedIpResponse addProtectedIp(AddProtectedIpRequest request) throws JdcloudSdkException {
        return new AddProtectedIpExecutor().client(this).execute(request);
    }

    /**
     * 查询公网 IP 的监控流量
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpMonitorFlowResponse describeIpMonitorFlow(DescribeIpMonitorFlowRequest request) throws JdcloudSdkException {
        return new DescribeIpMonitorFlowExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的云物理服务器公网 IP(包括云物理服务器弹性公网 IP 及云物理服务器基础网络实例的公网 IP)
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCpsIpResourcesResponse describeCpsIpResources(DescribeCpsIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeCpsIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询防护规则 Geo 拦截可设置区域
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeGeoAreasResponse describeGeoAreas(DescribeGeoAreasRequest request) throws JdcloudSdkException {
        return new DescribeGeoAreasExecutor().client(this).execute(request);
    }

    /**
     * 攻击记录统计, 参数 ip 优先级大于 instanceId
  - 指定 ip 参数时, 忽略 instanceId 参数, 统计 ip 的攻击情况
  - 未指定 ip 时, 统计 instanceId 指定实例相关攻击情况
  - ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击情况

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackStatisticsResponse describeAttackStatistics(DescribeAttackStatisticsRequest request) throws JdcloudSdkException {
        return new DescribeAttackStatisticsExecutor().client(this).execute(request);
    }

    /**
     * 查询攻击来源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackSourceResponse describeAttackSource(DescribeAttackSourceRequest request) throws JdcloudSdkException {
        return new DescribeAttackSourceExecutor().client(this).execute(request);
    }

    /**
     * 升级防护包实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws JdcloudSdkException {
        return new ModifyInstanceExecutor().client(this).execute(request);
    }

    /**
     * 防护包防护信息概要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionOutlineResponse describeProtectionOutline(DescribeProtectionOutlineRequest request) throws JdcloudSdkException {
        return new DescribeProtectionOutlineExecutor().client(this).execute(request);
    }

    /**
     * 获取防护包实例或 IP 的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionRuleResponse describeProtectionRule(DescribeProtectionRuleRequest request) throws JdcloudSdkException {
        return new DescribeProtectionRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改防护包实例名称
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws JdcloudSdkException {
        return new ModifyInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 查询已防护 IP 列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectedIpListResponse describeProtectedIpList(DescribeProtectedIpListRequest request) throws JdcloudSdkException {
        return new DescribeProtectedIpListExecutor().client(this).execute(request);
    }

    /**
     * 查询防护包实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 查询攻击记录, 参数 ip 优先级大于 instanceId
  - 指定 ip 参数时, 忽略 instanceId 参数, 查询 ip 相关攻击记录
  - 未指定 ip 时, 查询 instanceId 指定实例相关攻击记录
  - ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击记录

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackLogsResponse describeAttackLogs(DescribeAttackLogsRequest request) throws JdcloudSdkException {
        return new DescribeAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 检测实例名称是否可用, 防护包实例名称不可重复
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckInstanceNameResponse checkInstanceName(CheckInstanceNameRequest request) throws JdcloudSdkException {
        return new CheckInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 查询各类型攻击次数, 参数 ip 优先级大于 instanceId
  - 指定 ip 参数时, 忽略 instanceId 参数, 查询 ip 相关攻击记录的各类型攻击次数
  - 未指定 ip 时, 查询 instanceId 指定实例相关攻击记录的各类型攻击次数
  - ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击记录的各类型攻击次数

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackTypeCountResponse describeAttackTypeCount(DescribeAttackTypeCountRequest request) throws JdcloudSdkException {
        return new DescribeAttackTypeCountExecutor().client(this).execute(request);
    }

    /**
     * 修改防护包实例或 IP 的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyProtectionRuleResponse modifyProtectionRule(ModifyProtectionRuleRequest request) throws JdcloudSdkException {
        return new ModifyProtectionRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的私有网络弹性公网 IP(不包括运营商级 NAT 保留地址和 IPv6)
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpResourcesResponse describeElasticIpResources(DescribeElasticIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询操作日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOperationRecordsResponse describeOperationRecords(DescribeOperationRecordsRequest request) throws JdcloudSdkException {
        return new DescribeOperationRecordsExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public AntiproClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private AntiproClient antiproClient;

        public DefaultBuilder() {
            antiproClient = new AntiproClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            antiproClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            antiproClient.httpRequestConfig = config;
            return this;
        }

        public AntiproClient build() throws JdcloudSdkException {

            if (antiproClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                antiproClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (antiproClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("AntiproClient build error: jdcloud credentials provider not set");
                }
            }
            if (antiproClient.httpRequestConfig == null) {
                antiproClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (antiproClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("AntiproClient build error: http request config not set");
                }
            }
            return antiproClient;
        }

        public Builder environment(Environment environment) {
            antiproClient.environment = environment;
            return this;
        }
    }
}
