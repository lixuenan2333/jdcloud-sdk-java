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

package com.jdcloud.sdk.service.jdro.model;


/**
 * 资源类型定义
 */
public class ResourceTypes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源输出参数定义
     */
    private Object attributes;

    /**
     * 资源描述
     */
    private String description;

    /**
     * 文档链接
     */
    private String documentation;

    /**
     * 资源属性定义
     */
    private Object properties;


    /**
     * get 资源输出参数定义
     *
     * @return
     */
    public Object getAttributes() {
        return attributes;
    }

    /**
     * set 资源输出参数定义
     *
     * @param attributes
     */
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * get 资源描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 资源描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 文档链接
     *
     * @return
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * set 文档链接
     *
     * @param documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * get 资源属性定义
     *
     * @return
     */
    public Object getProperties() {
        return properties;
    }

    /**
     * set 资源属性定义
     *
     * @param properties
     */
    public void setProperties(Object properties) {
        this.properties = properties;
    }


    /**
     * set 资源输出参数定义
     *
     * @param attributes
     */
    public ResourceTypes attributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * set 资源描述
     *
     * @param description
     */
    public ResourceTypes description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 文档链接
     *
     * @param documentation
     */
    public ResourceTypes documentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * set 资源属性定义
     *
     * @param properties
     */
    public ResourceTypes properties(Object properties) {
        this.properties = properties;
        return this;
    }


}