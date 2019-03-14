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

package com.jdcloud.sdk.service.partner.model;


/**
 * distributorQuery
 */
public class DistributorQuery  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 渠道商ID
     */
    private String distributorId;

    /**
     * 渠道商名称
     */
    private String distributorName;

    /**
     * 京东云账户
     */
    private String pin;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 营业执照号
     */
    private String businessLicense;

    /**
     * 法定代表人
     */
    private String legalRepresentative;

    /**
     * 营业执照图片
     */
    private String businessLicensePic;

    /**
     * 主营业务描述
     */
    private String businessDesc;

    /**
     * 办公地址
     */
    private String workAddress;

    /**
     * 联系人姓名
     */
    private String contracter;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 所属地域
     */
    private String region;

    /**
     * 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     */
    private String settleTime;

    /**
     * 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     */
    private Integer status;

    /**
     * 驳回原因
     */
    private String reason;

    /**
     * 级次(0一级、1 二级)
     */
    private Integer distributorLevel;

    /**
     * 渠道商类型(0合作伙伴、1 渠道代理)
     */
    private Integer distributorType;

    /**
     * 上级渠道商pin
     */
    private String parentPin;

    /**
     * 上级渠道商ID
     */
    private String parentDistributorId;

    /**
     * 上级渠道商名称
     */
    private String parentDistributorName;

    /**
     * 所属部门(0企业线、1政府线)
     */
    private Integer dept;

    /**
     * 京东云负责人(京东云人员erp或名称)
     */
    private String erp;

    /**
     * 入驻条件开始日期
     */
    private String settleTimeBegin;

    /**
     * 入驻条件结束日期
     */
    private String settleTimeEnd;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 每页结果数量
     */
    private Integer pageSize;

    /**
     * offset
     */
    private Integer offset;


    /**
     * get 渠道商ID
     *
     * @return
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * set 渠道商ID
     *
     * @param distributorId
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * get 渠道商名称
     *
     * @return
     */
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * set 渠道商名称
     *
     * @param distributorName
     */
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    /**
     * get 京东云账户
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 京东云账户
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 合同编号
     *
     * @return
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * get 营业执照号
     *
     * @return
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * set 营业执照号
     *
     * @param businessLicense
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * get 法定代表人
     *
     * @return
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    /**
     * get 营业执照图片
     *
     * @return
     */
    public String getBusinessLicensePic() {
        return businessLicensePic;
    }

    /**
     * set 营业执照图片
     *
     * @param businessLicensePic
     */
    public void setBusinessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
    }

    /**
     * get 主营业务描述
     *
     * @return
     */
    public String getBusinessDesc() {
        return businessDesc;
    }

    /**
     * set 主营业务描述
     *
     * @param businessDesc
     */
    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    /**
     * get 办公地址
     *
     * @return
     */
    public String getWorkAddress() {
        return workAddress;
    }

    /**
     * set 办公地址
     *
     * @param workAddress
     */
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    /**
     * get 联系人姓名
     *
     * @return
     */
    public String getContracter() {
        return contracter;
    }

    /**
     * set 联系人姓名
     *
     * @param contracter
     */
    public void setContracter(String contracter) {
        this.contracter = contracter;
    }

    /**
     * get 联系人电话
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     * set 联系人电话
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 所属地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 所属地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @return
     */
    public String getSettleTime() {
        return settleTime;
    }

    /**
     * set 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @param settleTime
     */
    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * get 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 驳回原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * get 级次(0一级、1 二级)
     *
     * @return
     */
    public Integer getDistributorLevel() {
        return distributorLevel;
    }

    /**
     * set 级次(0一级、1 二级)
     *
     * @param distributorLevel
     */
    public void setDistributorLevel(Integer distributorLevel) {
        this.distributorLevel = distributorLevel;
    }

    /**
     * get 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @return
     */
    public Integer getDistributorType() {
        return distributorType;
    }

    /**
     * set 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @param distributorType
     */
    public void setDistributorType(Integer distributorType) {
        this.distributorType = distributorType;
    }

    /**
     * get 上级渠道商pin
     *
     * @return
     */
    public String getParentPin() {
        return parentPin;
    }

    /**
     * set 上级渠道商pin
     *
     * @param parentPin
     */
    public void setParentPin(String parentPin) {
        this.parentPin = parentPin;
    }

    /**
     * get 上级渠道商ID
     *
     * @return
     */
    public String getParentDistributorId() {
        return parentDistributorId;
    }

    /**
     * set 上级渠道商ID
     *
     * @param parentDistributorId
     */
    public void setParentDistributorId(String parentDistributorId) {
        this.parentDistributorId = parentDistributorId;
    }

    /**
     * get 上级渠道商名称
     *
     * @return
     */
    public String getParentDistributorName() {
        return parentDistributorName;
    }

    /**
     * set 上级渠道商名称
     *
     * @param parentDistributorName
     */
    public void setParentDistributorName(String parentDistributorName) {
        this.parentDistributorName = parentDistributorName;
    }

    /**
     * get 所属部门(0企业线、1政府线)
     *
     * @return
     */
    public Integer getDept() {
        return dept;
    }

    /**
     * set 所属部门(0企业线、1政府线)
     *
     * @param dept
     */
    public void setDept(Integer dept) {
        this.dept = dept;
    }

    /**
     * get 京东云负责人(京东云人员erp或名称)
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set 京东云负责人(京东云人员erp或名称)
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }

    /**
     * get 入驻条件开始日期
     *
     * @return
     */
    public String getSettleTimeBegin() {
        return settleTimeBegin;
    }

    /**
     * set 入驻条件开始日期
     *
     * @param settleTimeBegin
     */
    public void setSettleTimeBegin(String settleTimeBegin) {
        this.settleTimeBegin = settleTimeBegin;
    }

    /**
     * get 入驻条件结束日期
     *
     * @return
     */
    public String getSettleTimeEnd() {
        return settleTimeEnd;
    }

    /**
     * set 入驻条件结束日期
     *
     * @param settleTimeEnd
     */
    public void setSettleTimeEnd(String settleTimeEnd) {
        this.settleTimeEnd = settleTimeEnd;
    }

    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 每页结果数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get offset
     *
     * @return
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    /**
     * set 渠道商ID
     *
     * @param distributorId
     */
    public DistributorQuery distributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }

    /**
     * set 渠道商名称
     *
     * @param distributorName
     */
    public DistributorQuery distributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }

    /**
     * set 京东云账户
     *
     * @param pin
     */
    public DistributorQuery pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public DistributorQuery contractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }

    /**
     * set 营业执照号
     *
     * @param businessLicense
     */
    public DistributorQuery businessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
        return this;
    }

    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public DistributorQuery legalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }

    /**
     * set 营业执照图片
     *
     * @param businessLicensePic
     */
    public DistributorQuery businessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
        return this;
    }

    /**
     * set 主营业务描述
     *
     * @param businessDesc
     */
    public DistributorQuery businessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
        return this;
    }

    /**
     * set 办公地址
     *
     * @param workAddress
     */
    public DistributorQuery workAddress(String workAddress) {
        this.workAddress = workAddress;
        return this;
    }

    /**
     * set 联系人姓名
     *
     * @param contracter
     */
    public DistributorQuery contracter(String contracter) {
        this.contracter = contracter;
        return this;
    }

    /**
     * set 联系人电话
     *
     * @param tel
     */
    public DistributorQuery tel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public DistributorQuery email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 所属地域
     *
     * @param region
     */
    public DistributorQuery region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @param settleTime
     */
    public DistributorQuery settleTime(String settleTime) {
        this.settleTime = settleTime;
        return this;
    }

    /**
     * set 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @param status
     */
    public DistributorQuery status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public DistributorQuery reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * set 级次(0一级、1 二级)
     *
     * @param distributorLevel
     */
    public DistributorQuery distributorLevel(Integer distributorLevel) {
        this.distributorLevel = distributorLevel;
        return this;
    }

    /**
     * set 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @param distributorType
     */
    public DistributorQuery distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set 上级渠道商pin
     *
     * @param parentPin
     */
    public DistributorQuery parentPin(String parentPin) {
        this.parentPin = parentPin;
        return this;
    }

    /**
     * set 上级渠道商ID
     *
     * @param parentDistributorId
     */
    public DistributorQuery parentDistributorId(String parentDistributorId) {
        this.parentDistributorId = parentDistributorId;
        return this;
    }

    /**
     * set 上级渠道商名称
     *
     * @param parentDistributorName
     */
    public DistributorQuery parentDistributorName(String parentDistributorName) {
        this.parentDistributorName = parentDistributorName;
        return this;
    }

    /**
     * set 所属部门(0企业线、1政府线)
     *
     * @param dept
     */
    public DistributorQuery dept(Integer dept) {
        this.dept = dept;
        return this;
    }

    /**
     * set 京东云负责人(京东云人员erp或名称)
     *
     * @param erp
     */
    public DistributorQuery erp(String erp) {
        this.erp = erp;
        return this;
    }

    /**
     * set 入驻条件开始日期
     *
     * @param settleTimeBegin
     */
    public DistributorQuery settleTimeBegin(String settleTimeBegin) {
        this.settleTimeBegin = settleTimeBegin;
        return this;
    }

    /**
     * set 入驻条件结束日期
     *
     * @param settleTimeEnd
     */
    public DistributorQuery settleTimeEnd(String settleTimeEnd) {
        this.settleTimeEnd = settleTimeEnd;
        return this;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public DistributorQuery pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public DistributorQuery pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public DistributorQuery offset(Integer offset) {
        this.offset = offset;
        return this;
    }


}