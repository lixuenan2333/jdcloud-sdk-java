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
 * File-System
 * 文件系统相关接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.zfs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改文件系统属性(name 和 description 必须要指定一个)
 */
public class ModifyFileSystemAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件系统名称(参数规则：不可为空，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且不能超过32字符)
     */
    private String name;

    /**
     * 文件系统描述(参数规则：不能超过256字符)
     */
    private String description;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 文件系统ID
     * Required:true
     */
    @Required
    private String fileSystemId;


    /**
     * get 文件系统名称(参数规则：不可为空，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且不能超过32字符)
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 文件系统名称(参数规则：不可为空，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且不能超过32字符)
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 文件系统描述(参数规则：不能超过256字符)
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 文件系统描述(参数规则：不能超过256字符)
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 文件系统ID
     *
     * @return
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * set 文件系统ID
     *
     * @param fileSystemId
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }


    /**
     * set 文件系统名称(参数规则：不可为空，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且不能超过32字符)
     *
     * @param name
     */
    public ModifyFileSystemAttributeRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 文件系统描述(参数规则：不能超过256字符)
     *
     * @param description
     */
    public ModifyFileSystemAttributeRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ModifyFileSystemAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 文件系统ID
     *
     * @param fileSystemId
     */
    public ModifyFileSystemAttributeRequest fileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }


}