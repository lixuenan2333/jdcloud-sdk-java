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
 * 云物理服务器
 * 云物理服务器私有网络操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cps.model.Vpc;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询私有网络列表
 */
public class DescribeVpcsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * vpcs
     */
    private List<Vpc> vpcs;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[20, 100]
     */
    private Integer pageSize;

    /**
     * 查询结果总数
     */
    private Integer totalCount;


    /**
     * get vpcs
     *
     * @return
     */
    public List<Vpc> getVpcs() {
        return vpcs;
    }

    /**
     * set vpcs
     *
     * @param vpcs
     */
    public void setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
    }

    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[20, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询结果总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set vpcs
     *
     * @param vpcs
     */
    public DescribeVpcsResult vpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeVpcsResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public DescribeVpcsResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public DescribeVpcsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to vpcs
     *
     * @param vpc
     */
    public void addVpc(Vpc vpc) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpc);
    }

}