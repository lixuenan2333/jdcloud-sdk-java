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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdro.model.DescribeResourceTypeListItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询支持的资源列表
 */
public class DescribeResourceTypeListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * resourceTypeList
     */
    private List<DescribeResourceTypeListItem> resourceTypeList;

    /**
     * totalCount
     */
    private Long totalCount;


    /**
     * get resourceTypeList
     *
     * @return
     */
    public List<DescribeResourceTypeListItem> getResourceTypeList() {
        return resourceTypeList;
    }

    /**
     * set resourceTypeList
     *
     * @param resourceTypeList
     */
    public void setResourceTypeList(List<DescribeResourceTypeListItem> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set resourceTypeList
     *
     * @param resourceTypeList
     */
    public DescribeResourceTypeListResult resourceTypeList(List<DescribeResourceTypeListItem> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeResourceTypeListResult totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to resourceTypeList
     *
     * @param resourceTypeList
     */
    public void addResourceTypeList(DescribeResourceTypeListItem resourceTypeList) {
        if (this.resourceTypeList == null) {
            this.resourceTypeList = new ArrayList<>();
        }
        this.resourceTypeList.add(resourceTypeList);
    }

}