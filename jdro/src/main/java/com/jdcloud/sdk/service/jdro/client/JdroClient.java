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
 * 资源编排
 * 资源编排
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdro.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.jdro.model.DescribeStacksRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeStacksResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeStacksExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeStackEventsRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeStackEventsResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeStackEventsExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeStackResourcesRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeStackResourcesResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeStackResourcesExecutor;
import com.jdcloud.sdk.service.jdro.model.CreateChangeSetRequest;
import com.jdcloud.sdk.service.jdro.model.CreateChangeSetResponse;
import com.jdcloud.sdk.service.jdro.client.CreateChangeSetExecutor;
import com.jdcloud.sdk.service.jdro.model.CreateStackRequest;
import com.jdcloud.sdk.service.jdro.model.CreateStackResponse;
import com.jdcloud.sdk.service.jdro.client.CreateStackExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeStackRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeStackResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeStackExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeStackTemplateRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeStackTemplateResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeStackTemplateExecutor;
import com.jdcloud.sdk.service.jdro.model.ExecuteChangeSetRequest;
import com.jdcloud.sdk.service.jdro.model.ExecuteChangeSetResponse;
import com.jdcloud.sdk.service.jdro.client.ExecuteChangeSetExecutor;
import com.jdcloud.sdk.service.jdro.model.DeleteStackRequest;
import com.jdcloud.sdk.service.jdro.model.DeleteStackResponse;
import com.jdcloud.sdk.service.jdro.client.DeleteStackExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeResourceTypeSpecificationRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeResourceTypeSpecificationResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeResourceTypeSpecificationExecutor;
import com.jdcloud.sdk.service.jdro.model.ValidateTemplateRequest;
import com.jdcloud.sdk.service.jdro.model.ValidateTemplateResponse;
import com.jdcloud.sdk.service.jdro.client.ValidateTemplateExecutor;
import com.jdcloud.sdk.service.jdro.model.DescribeResourceTypeListRequest;
import com.jdcloud.sdk.service.jdro.model.DescribeResourceTypeListResponse;
import com.jdcloud.sdk.service.jdro.client.DescribeResourceTypeListExecutor;

/**
 * jdroClient
 */
public class JdroClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.10";
    public final static String DefaultEndpoint = "jdro.jdcloud-api.com";
    public final static String ServiceName = "jdro";
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

    private JdroClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询资源栈列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStacksResponse describeStacks(DescribeStacksRequest request) throws JdcloudSdkException {
        return new DescribeStacksExecutor().client(this).execute(request);
    }

    /**
     * 查询资源栈事件列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStackEventsResponse describeStackEvents(DescribeStackEventsRequest request) throws JdcloudSdkException {
        return new DescribeStackEventsExecutor().client(this).execute(request);
    }

    /**
     * 查询资源栈中资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStackResourcesResponse describeStackResources(DescribeStackResourcesRequest request) throws JdcloudSdkException {
        return new DescribeStackResourcesExecutor().client(this).execute(request);
    }

    /**
     * 创建更改集
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws JdcloudSdkException {
        return new CreateChangeSetExecutor().client(this).execute(request);
    }

    /**
     * 创建资源栈
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateStackResponse createStack(CreateStackRequest request) throws JdcloudSdkException {
        return new CreateStackExecutor().client(this).execute(request);
    }

    /**
     * 查询资源栈详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStackResponse describeStack(DescribeStackRequest request) throws JdcloudSdkException {
        return new DescribeStackExecutor().client(this).execute(request);
    }

    /**
     * 查询资源栈使用的模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStackTemplateResponse describeStackTemplate(DescribeStackTemplateRequest request) throws JdcloudSdkException {
        return new DescribeStackTemplateExecutor().client(this).execute(request);
    }

    /**
     * 执行更改集
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecuteChangeSetResponse executeChangeSet(ExecuteChangeSetRequest request) throws JdcloudSdkException {
        return new ExecuteChangeSetExecutor().client(this).execute(request);
    }

    /**
     * 删除资源栈
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteStackResponse deleteStack(DeleteStackRequest request) throws JdcloudSdkException {
        return new DeleteStackExecutor().client(this).execute(request);
    }

    /**
     * 查询支持的资源结构详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeResourceTypeSpecificationResponse describeResourceTypeSpecification(DescribeResourceTypeSpecificationRequest request) throws JdcloudSdkException {
        return new DescribeResourceTypeSpecificationExecutor().client(this).execute(request);
    }

    /**
     * 模板校验
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws JdcloudSdkException {
        return new ValidateTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询支持的资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeResourceTypeListResponse describeResourceTypeList(DescribeResourceTypeListRequest request) throws JdcloudSdkException {
        return new DescribeResourceTypeListExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public JdroClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private JdroClient jdroClient;

        public DefaultBuilder() {
            jdroClient = new JdroClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            jdroClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            jdroClient.httpRequestConfig = config;
            return this;
        }

        public JdroClient build() throws JdcloudSdkException {

            if (jdroClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                jdroClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (jdroClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("JdroClient build error: jdcloud credentials provider not set");
                }
            }
            if (jdroClient.httpRequestConfig == null) {
                jdroClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (jdroClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("JdroClient build error: http request config not set");
                }
            }
            return jdroClient;
        }

        public Builder environment(Environment environment) {
            jdroClient.environment = environment;
            return this;
        }
    }
}
