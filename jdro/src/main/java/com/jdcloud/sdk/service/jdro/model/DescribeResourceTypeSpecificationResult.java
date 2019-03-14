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
 * 资源
 * 资源相关操作接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdro.model;

import com.jdcloud.sdk.service.jdro.model.ResourceTypes;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询支持的资源结构详情
 */
public class DescribeResourceTypeSpecificationResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * propertyTypes
     */
    private Object propertyTypes;

    /**
     * resourceTypes
     */
    private ResourceTypes resourceTypes;


    /**
     * get propertyTypes
     *
     * @return
     */
    public Object getPropertyTypes() {
        return propertyTypes;
    }

    /**
     * set propertyTypes
     *
     * @param propertyTypes
     */
    public void setPropertyTypes(Object propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    /**
     * get resourceTypes
     *
     * @return
     */
    public ResourceTypes getResourceTypes() {
        return resourceTypes;
    }

    /**
     * set resourceTypes
     *
     * @param resourceTypes
     */
    public void setResourceTypes(ResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
    }


    /**
     * set propertyTypes
     *
     * @param propertyTypes
     */
    public DescribeResourceTypeSpecificationResult propertyTypes(Object propertyTypes) {
        this.propertyTypes = propertyTypes;
        return this;
    }

    /**
     * set resourceTypes
     *
     * @param resourceTypes
     */
    public DescribeResourceTypeSpecificationResult resourceTypes(ResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }


}