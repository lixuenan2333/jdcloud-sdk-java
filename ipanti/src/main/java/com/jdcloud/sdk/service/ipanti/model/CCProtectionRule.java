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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * cCProtectionRule
 */
public class CCProtectionRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CC 防护规则 ID
     */
    private Long id;

    /**
     * CC 防护规则对应的网站规则 ID
     */
    private Long webRuleId;

    /**
     * CC 防护规则对应的实例 ID
     */
    private Long instanceId;

    /**
     * CC 防护规则名称, 30 字符以内
     */
    private String name;

    /**
     * CC 防护规则状态: 0: 关闭, 1: 开启
     */
    private Integer enable;

    /**
     * uri, 以 / 开头, 200 字符以内
     */
    private String uri;

    /**
     * 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     */
    private Integer matchType;

    /**
     * 检测周期, 单位为秒, 取值范围[5, 10800]
     */
    private Long detectPeriod;

    /**
     * ip 访问次数, 取值范围[2, 2000]
     */
    private Long singleIpLimit;

    /**
     * 阻断类型, 1: 封禁, 2: 人机交互
     */
    private Integer blockType;

    /**
     * 阻断持续时间, 单位为分钟, 取值范围[1, 1440]
     */
    private Long blockTime;


    /**
     * get CC 防护规则 ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set CC 防护规则 ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get CC 防护规则对应的网站规则 ID
     *
     * @return
     */
    public Long getWebRuleId() {
        return webRuleId;
    }

    /**
     * set CC 防护规则对应的网站规则 ID
     *
     * @param webRuleId
     */
    public void setWebRuleId(Long webRuleId) {
        this.webRuleId = webRuleId;
    }

    /**
     * get CC 防护规则对应的实例 ID
     *
     * @return
     */
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * set CC 防护规则对应的实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get CC 防护规则名称, 30 字符以内
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set CC 防护规则名称, 30 字符以内
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get CC 防护规则状态: 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set CC 防护规则状态: 0: 关闭, 1: 开启
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get uri, 以 / 开头, 200 字符以内
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri, 以 / 开头, 200 字符以内
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * get 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @return
     */
    public Integer getMatchType() {
        return matchType;
    }

    /**
     * set 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @param matchType
     */
    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    /**
     * get 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @return
     */
    public Long getDetectPeriod() {
        return detectPeriod;
    }

    /**
     * set 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @param detectPeriod
     */
    public void setDetectPeriod(Long detectPeriod) {
        this.detectPeriod = detectPeriod;
    }

    /**
     * get ip 访问次数, 取值范围[2, 2000]
     *
     * @return
     */
    public Long getSingleIpLimit() {
        return singleIpLimit;
    }

    /**
     * set ip 访问次数, 取值范围[2, 2000]
     *
     * @param singleIpLimit
     */
    public void setSingleIpLimit(Long singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
    }

    /**
     * get 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @return
     */
    public Integer getBlockType() {
        return blockType;
    }

    /**
     * set 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @param blockType
     */
    public void setBlockType(Integer blockType) {
        this.blockType = blockType;
    }

    /**
     * get 阻断持续时间, 单位为分钟, 取值范围[1, 1440]
     *
     * @return
     */
    public Long getBlockTime() {
        return blockTime;
    }

    /**
     * set 阻断持续时间, 单位为分钟, 取值范围[1, 1440]
     *
     * @param blockTime
     */
    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }


    /**
     * set CC 防护规则 ID
     *
     * @param id
     */
    public CCProtectionRule id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set CC 防护规则对应的网站规则 ID
     *
     * @param webRuleId
     */
    public CCProtectionRule webRuleId(Long webRuleId) {
        this.webRuleId = webRuleId;
        return this;
    }

    /**
     * set CC 防护规则对应的实例 ID
     *
     * @param instanceId
     */
    public CCProtectionRule instanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set CC 防护规则名称, 30 字符以内
     *
     * @param name
     */
    public CCProtectionRule name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set CC 防护规则状态: 0: 关闭, 1: 开启
     *
     * @param enable
     */
    public CCProtectionRule enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set uri, 以 / 开头, 200 字符以内
     *
     * @param uri
     */
    public CCProtectionRule uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @param matchType
     */
    public CCProtectionRule matchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * set 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @param detectPeriod
     */
    public CCProtectionRule detectPeriod(Long detectPeriod) {
        this.detectPeriod = detectPeriod;
        return this;
    }

    /**
     * set ip 访问次数, 取值范围[2, 2000]
     *
     * @param singleIpLimit
     */
    public CCProtectionRule singleIpLimit(Long singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
        return this;
    }

    /**
     * set 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @param blockType
     */
    public CCProtectionRule blockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }

    /**
     * set 阻断持续时间, 单位为分钟, 取值范围[1, 1440]
     *
     * @param blockTime
     */
    public CCProtectionRule blockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }


}