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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vpcInfoDetail
 */
public class VpcInfoDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Vpc的Id
     */
    private String id;

    /**
     * 私有网络名称
     */
    private String name;

    /**
     * 地址范围
     */
    private String cidrBlock;

    /**
     * VPC 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 所属云提供商ID
     */
    private String cloudID;

    /**
     * 私有网络包含的子网列表
     */
    private List<SubnetInfo> subnets;

    /**
     * 路由表ID集合
     */
    private List<String> routeTableIds;


    /**
     * get Vpc的Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set Vpc的Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 私有网络名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 私有网络名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 地址范围
     *
     * @return
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * set 地址范围
     *
     * @param cidrBlock
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * get VPC 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VPC 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 私有网络包含的子网列表
     *
     * @return
     */
    public List<SubnetInfo> getSubnets() {
        return subnets;
    }

    /**
     * set 私有网络包含的子网列表
     *
     * @param subnets
     */
    public void setSubnets(List<SubnetInfo> subnets) {
        this.subnets = subnets;
    }

    /**
     * get 路由表ID集合
     *
     * @return
     */
    public List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * set 路由表ID集合
     *
     * @param routeTableIds
     */
    public void setRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }


    /**
     * set Vpc的Id
     *
     * @param id
     */
    public VpcInfoDetail id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 私有网络名称
     *
     * @param name
     */
    public VpcInfoDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 地址范围
     *
     * @param cidrBlock
     */
    public VpcInfoDetail cidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * set VPC 描述
     *
     * @param description
     */
    public VpcInfoDetail description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public VpcInfoDetail createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public VpcInfoDetail cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 私有网络包含的子网列表
     *
     * @param subnets
     */
    public VpcInfoDetail subnets(List<SubnetInfo> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * set 路由表ID集合
     *
     * @param routeTableIds
     */
    public VpcInfoDetail routeTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
        return this;
    }


    /**
     * add item to 私有网络包含的子网列表
     *
     * @param subnet
     */
    public void addSubnet(SubnetInfo subnet) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnet);
    }

    /**
     * add item to 路由表ID集合
     *
     * @param routeTableId
     */
    public void addRouteTableId(String routeTableId) {
        if (this.routeTableIds == null) {
            this.routeTableIds = new ArrayList<>();
        }
        this.routeTableIds.add(routeTableId);
    }

}