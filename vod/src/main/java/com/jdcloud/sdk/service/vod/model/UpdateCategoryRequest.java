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
 * Category
 * 媒资分类相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改分类
 */
public class UpdateCategoryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类级别
     */
    private Integer level;

    /**
     * 父分类ID
     */
    private Long parentId;

    /**
     * 分类描述信息
     */
    private String description;

    /**
     * 分类ID
     * Required:true
     */
    @Required
    private Long categoryId;


    /**
     * get 分类ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 分类ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 分类名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 分类名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 分类级别
     *
     * @return
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * set 分类级别
     *
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * get 父分类ID
     *
     * @return
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * set 父分类ID
     *
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * get 分类描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 分类描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 分类ID
     *
     * @return
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * set 分类ID
     *
     * @param id
     */
    public UpdateCategoryRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 分类名称
     *
     * @param name
     */
    public UpdateCategoryRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 分类级别
     *
     * @param level
     */
    public UpdateCategoryRequest level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * set 父分类ID
     *
     * @param parentId
     */
    public UpdateCategoryRequest parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * set 分类描述信息
     *
     * @param description
     */
    public UpdateCategoryRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public UpdateCategoryRequest categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }


}