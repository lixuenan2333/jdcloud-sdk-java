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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;
import com.jdcloud.sdk.service.disk.model.Tag;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 主网卡所属VPC的ID
     */
    private String vpcId;

    /**
     * 主网卡所属子网的ID
     */
    private String subnetId;

    /**
     * 主网卡主IP地址
     */
    private String privateIpAddress;

    /**
     * 主网卡主IP绑定弹性IP的ID
     */
    private String elasticIpId;

    /**
     * 主网卡主IP绑定弹性IP的地址
     */
    private String elasticIpAddress;

    /**
     * 实例状态，[pending,starting,running,stopping,stopped,rebooting,rebuilding,resizing,deleting,error]
     */
    private String status;

    /**
     * 实例描述
     */
    private String description;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 系统盘信息
     */
    private InstanceDiskAttachment systemDisk;

    /**
     * 数据盘信息
     */
    private List<InstanceDiskAttachment> dataDisks;

    /**
     * 主网卡信息
     */
    private InstanceNetworkInterfaceAttachment primaryNetworkInterface;

    /**
     * 创建时间
     */
    private String launchTime;

    /**
     * 可用区
     */
    private String az;

    /**
     * 密钥对名称
     */
    private List<String> keyNames;

    /**
     * 计费信息
     */
    private Charge charge;

    /**
     * Tag信息
     */
    private List<Tag> tags;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 主网卡所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 主网卡所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 主网卡所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 主网卡主IP地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 主网卡主IP地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 主网卡主IP绑定弹性IP的ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 主网卡主IP绑定弹性IP的ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 主网卡主IP绑定弹性IP的地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 主网卡主IP绑定弹性IP的地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }

    /**
     * get 实例状态，[pending,starting,running,stopping,stopped,rebooting,rebuilding,resizing,deleting,error]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 实例状态，[pending,starting,running,stopping,stopped,rebooting,rebuilding,resizing,deleting,error]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 实例描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 系统盘信息
     *
     * @return
     */
    public InstanceDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘信息
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘信息
     *
     * @return
     */
    public List<InstanceDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘信息
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 主网卡信息
     *
     * @return
     */
    public InstanceNetworkInterfaceAttachment getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡信息
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * set 创建时间
     *
     * @param launchTime
     */
    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 密钥对名称
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 密钥对名称
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public Instance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public Instance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 主网卡所属子网的ID
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 主网卡主IP地址
     *
     * @param privateIpAddress
     */
    public Instance privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 主网卡主IP绑定弹性IP的ID
     *
     * @param elasticIpId
     */
    public Instance elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 主网卡主IP绑定弹性IP的地址
     *
     * @param elasticIpAddress
     */
    public Instance elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }

    /**
     * set 实例状态，[pending,starting,running,stopping,stopped,rebooting,rebuilding,resizing,deleting,error]
     *
     * @param status
     */
    public Instance status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 实例描述
     *
     * @param description
     */
    public Instance description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public Instance imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 系统盘信息
     *
     * @param systemDisk
     */
    public Instance systemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘信息
     *
     * @param dataDisks
     */
    public Instance dataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 主网卡信息
     *
     * @param primaryNetworkInterface
     */
    public Instance primaryNetworkInterface(InstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param launchTime
     */
    public Instance launchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public Instance az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 密钥对名称
     *
     * @param keyNames
     */
    public Instance keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public Instance tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 数据盘信息
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 密钥对名称
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

    /**
     * add item to Tag信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}