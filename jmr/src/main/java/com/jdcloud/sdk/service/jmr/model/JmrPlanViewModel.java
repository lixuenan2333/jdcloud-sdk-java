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

package com.jdcloud.sdk.service.jmr.model;


/**
 * jmrPlanViewModel
 */
public class JmrPlanViewModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务调度id
     */
    private Number planId;

    /**
     * planName
     */
    private String planName;

    /**
     * planType
     */
    private String planType;

    /**
     * planStatus
     */
    private String planStatus;

    /**
     * 任务调度失败时采用的策略
     */
    private String failurePolicy;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 数据中心，即regionId
     */
    private String dataCenter;

    /**
     * jobGroup
     */
    private String jobGroup;

    /**
     * 触发器
     */
    private String jobTrigger;

    /**
     * formatt后的时间
     */
    private String cronExpression;

    /**
     * isSync
     */
    private Boolean isSync;

    /**
     * description
     */
    private String description;

    /**
     * jobIds
     */
    private String jobIds;

    /**
     * clusterId
     */
    private String clusterId;

    /**
     * clusterName
     */
    private String clusterName;

    /**
     * orderBy
     */
    private String orderBy;


    /**
     * get 任务调度id
     *
     * @return
     */
    public Number getPlanId() {
        return planId;
    }

    /**
     * set 任务调度id
     *
     * @param planId
     */
    public void setPlanId(Number planId) {
        this.planId = planId;
    }

    /**
     * get planName
     *
     * @return
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * set planName
     *
     * @param planName
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * get planType
     *
     * @return
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * set planType
     *
     * @param planType
     */
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * get planStatus
     *
     * @return
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * set planStatus
     *
     * @param planStatus
     */
    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    /**
     * get 任务调度失败时采用的策略
     *
     * @return
     */
    public String getFailurePolicy() {
        return failurePolicy;
    }

    /**
     * set 任务调度失败时采用的策略
     *
     * @param failurePolicy
     */
    public void setFailurePolicy(String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * set 修改时间
     *
     * @param modifyTime
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * get 数据中心，即regionId
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get jobGroup
     *
     * @return
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * set jobGroup
     *
     * @param jobGroup
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * get 触发器
     *
     * @return
     */
    public String getJobTrigger() {
        return jobTrigger;
    }

    /**
     * set 触发器
     *
     * @param jobTrigger
     */
    public void setJobTrigger(String jobTrigger) {
        this.jobTrigger = jobTrigger;
    }

    /**
     * get formatt后的时间
     *
     * @return
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * set formatt后的时间
     *
     * @param cronExpression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * get isSync
     *
     * @return
     */
    public Boolean getIsSync() {
        return isSync;
    }

    /**
     * set isSync
     *
     * @param isSync
     */
    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    /**
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get jobIds
     *
     * @return
     */
    public String getJobIds() {
        return jobIds;
    }

    /**
     * set jobIds
     *
     * @param jobIds
     */
    public void setJobIds(String jobIds) {
        this.jobIds = jobIds;
    }

    /**
     * get clusterId
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set clusterId
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * get clusterName
     *
     * @return
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * set clusterName
     *
     * @param clusterName
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * get orderBy
     *
     * @return
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * set orderBy
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * set 任务调度id
     *
     * @param planId
     */
    public JmrPlanViewModel planId(Number planId) {
        this.planId = planId;
        return this;
    }

    /**
     * set planName
     *
     * @param planName
     */
    public JmrPlanViewModel planName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * set planType
     *
     * @param planType
     */
    public JmrPlanViewModel planType(String planType) {
        this.planType = planType;
        return this;
    }

    /**
     * set planStatus
     *
     * @param planStatus
     */
    public JmrPlanViewModel planStatus(String planStatus) {
        this.planStatus = planStatus;
        return this;
    }

    /**
     * set 任务调度失败时采用的策略
     *
     * @param failurePolicy
     */
    public JmrPlanViewModel failurePolicy(String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public JmrPlanViewModel createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param modifyTime
     */
    public JmrPlanViewModel modifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public JmrPlanViewModel dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set jobGroup
     *
     * @param jobGroup
     */
    public JmrPlanViewModel jobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }

    /**
     * set 触发器
     *
     * @param jobTrigger
     */
    public JmrPlanViewModel jobTrigger(String jobTrigger) {
        this.jobTrigger = jobTrigger;
        return this;
    }

    /**
     * set formatt后的时间
     *
     * @param cronExpression
     */
    public JmrPlanViewModel cronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * set isSync
     *
     * @param isSync
     */
    public JmrPlanViewModel isSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }

    /**
     * set description
     *
     * @param description
     */
    public JmrPlanViewModel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set jobIds
     *
     * @param jobIds
     */
    public JmrPlanViewModel jobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    /**
     * set clusterId
     *
     * @param clusterId
     */
    public JmrPlanViewModel clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * set clusterName
     *
     * @param clusterName
     */
    public JmrPlanViewModel clusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * set orderBy
     *
     * @param orderBy
     */
    public JmrPlanViewModel orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }


}