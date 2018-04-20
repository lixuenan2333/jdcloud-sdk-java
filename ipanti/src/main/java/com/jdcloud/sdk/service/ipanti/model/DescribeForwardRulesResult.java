/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 非网站转发配置相关接口
 * 非网站转发配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ipanti.model.ForwardRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询某个实例下的非网站转发配置
 */
public class DescribeForwardRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * forwardRules
     */
    private List<ForwardRule> forwardRules;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get forwardRules
     *
     * @return
     */
    public List<ForwardRule> getForwardRules() {
        return forwardRules;
    }

    /**
     * set forwardRules
     *
     * @param forwardRules
     */
    public void setForwardRules(List<ForwardRule> forwardRules) {
        this.forwardRules = forwardRules;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set forwardRules
     *
     * @param forwardRules
     */
    public DescribeForwardRulesResult forwardRules(List<ForwardRule> forwardRules) {
        this.forwardRules = forwardRules;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeForwardRulesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to forwardRules
     *
     * @param forwardRule
     */
    public void addForwardRule(ForwardRule forwardRule) {
        if (this.forwardRules == null) {
            this.forwardRules = new ArrayList<>();
        }
        this.forwardRules.add(forwardRule);
    }

}