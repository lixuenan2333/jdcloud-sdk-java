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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.BackSourceInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询加速域名详情
 */
public class GetDomainDetailResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * null
     */
    private String allStatus;

    /**
     * allowNoReferHeader
     */
    private String allowNoReferHeader;

    /**
     * allowNullReferHeader
     */
    private String allowNullReferHeader;

    /**
     * dailyBandWidth
     */
    private Integer dailyBandWidth;

    /**
     * forbiddenType
     */
    private String forbiddenType;

    /**
     * maxFileSize
     */
    private Long maxFileSize;

    /**
     * minFileSize
     */
    private Long minFileSize;

    /**
     * sumFileSize
     */
    private Long sumFileSize;

    /**
     * avgFileSize
     */
    private Long avgFileSize;

    /**
     * referList
     */
    private List<String> referList;

    /**
     * referType
     */
    private String referType;

    /**
     * domain
     */
    private String domain;

    /**
     * cname
     */
    private String cname;

    /**
     * archiveNo
     */
    private String archiveNo;

    /**
     * type
     */
    private String type;

    /**
     * created
     */
    private String created;

    /**
     * modified
     */
    private String modified;

    /**
     * status
     */
    private String status;

    /**
     * auditStatus
     */
    private String auditStatus;

    /**
     * source
     */
    private BackSourceInfo source;

    /**
     * sourceType
     */
    private String sourceType;

    /**
     * 默认的回源host
     */
    private String defaultSourceHost;

    /**
     * backSourceType
     */
    private String backSourceType;

    /**
     * httpType
     */
    private String httpType;

    /**
     * certificate
     */
    private String certificate;

    /**
     * rsaKey
     */
    private String rsaKey;

    /**
     * jumpType
     */
    private String jumpType;

    /**
     * certFrom
     */
    private String certFrom;

    /**
     * sslCertId
     */
    private String sslCertId;

    /**
     * certName
     */
    private String certName;

    /**
     * certType
     */
    private String certType;

    /**
     * sslCertStartTime
     */
    private String sslCertStartTime;

    /**
     * sslCertEndTime
     */
    private String sslCertEndTime;


    /**
     * get null
     *
     * @return
     */
    public String getAllStatus() {
        return allStatus;
    }

    /**
     * set null
     *
     * @param allStatus
     */
    public void setAllStatus(String allStatus) {
        this.allStatus = allStatus;
    }

    /**
     * get allowNoReferHeader
     *
     * @return
     */
    public String getAllowNoReferHeader() {
        return allowNoReferHeader;
    }

    /**
     * set allowNoReferHeader
     *
     * @param allowNoReferHeader
     */
    public void setAllowNoReferHeader(String allowNoReferHeader) {
        this.allowNoReferHeader = allowNoReferHeader;
    }

    /**
     * get allowNullReferHeader
     *
     * @return
     */
    public String getAllowNullReferHeader() {
        return allowNullReferHeader;
    }

    /**
     * set allowNullReferHeader
     *
     * @param allowNullReferHeader
     */
    public void setAllowNullReferHeader(String allowNullReferHeader) {
        this.allowNullReferHeader = allowNullReferHeader;
    }

    /**
     * get dailyBandWidth
     *
     * @return
     */
    public Integer getDailyBandWidth() {
        return dailyBandWidth;
    }

    /**
     * set dailyBandWidth
     *
     * @param dailyBandWidth
     */
    public void setDailyBandWidth(Integer dailyBandWidth) {
        this.dailyBandWidth = dailyBandWidth;
    }

    /**
     * get forbiddenType
     *
     * @return
     */
    public String getForbiddenType() {
        return forbiddenType;
    }

    /**
     * set forbiddenType
     *
     * @param forbiddenType
     */
    public void setForbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
    }

    /**
     * get maxFileSize
     *
     * @return
     */
    public Long getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * set maxFileSize
     *
     * @param maxFileSize
     */
    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * get minFileSize
     *
     * @return
     */
    public Long getMinFileSize() {
        return minFileSize;
    }

    /**
     * set minFileSize
     *
     * @param minFileSize
     */
    public void setMinFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
    }

    /**
     * get sumFileSize
     *
     * @return
     */
    public Long getSumFileSize() {
        return sumFileSize;
    }

    /**
     * set sumFileSize
     *
     * @param sumFileSize
     */
    public void setSumFileSize(Long sumFileSize) {
        this.sumFileSize = sumFileSize;
    }

    /**
     * get avgFileSize
     *
     * @return
     */
    public Long getAvgFileSize() {
        return avgFileSize;
    }

    /**
     * set avgFileSize
     *
     * @param avgFileSize
     */
    public void setAvgFileSize(Long avgFileSize) {
        this.avgFileSize = avgFileSize;
    }

    /**
     * get referList
     *
     * @return
     */
    public List<String> getReferList() {
        return referList;
    }

    /**
     * set referList
     *
     * @param referList
     */
    public void setReferList(List<String> referList) {
        this.referList = referList;
    }

    /**
     * get referType
     *
     * @return
     */
    public String getReferType() {
        return referType;
    }

    /**
     * set referType
     *
     * @param referType
     */
    public void setReferType(String referType) {
        this.referType = referType;
    }

    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get cname
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set cname
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get archiveNo
     *
     * @return
     */
    public String getArchiveNo() {
        return archiveNo;
    }

    /**
     * set archiveNo
     *
     * @param archiveNo
     */
    public void setArchiveNo(String archiveNo) {
        this.archiveNo = archiveNo;
    }

    /**
     * get type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get created
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     * set created
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * get modified
     *
     * @return
     */
    public String getModified() {
        return modified;
    }

    /**
     * set modified
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * get status
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get auditStatus
     *
     * @return
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * set auditStatus
     *
     * @param auditStatus
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * get source
     *
     * @return
     */
    public BackSourceInfo getSource() {
        return source;
    }

    /**
     * set source
     *
     * @param source
     */
    public void setSource(BackSourceInfo source) {
        this.source = source;
    }

    /**
     * get sourceType
     *
     * @return
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * set sourceType
     *
     * @param sourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * get 默认的回源host
     *
     * @return
     */
    public String getDefaultSourceHost() {
        return defaultSourceHost;
    }

    /**
     * set 默认的回源host
     *
     * @param defaultSourceHost
     */
    public void setDefaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
    }

    /**
     * get backSourceType
     *
     * @return
     */
    public String getBackSourceType() {
        return backSourceType;
    }

    /**
     * set backSourceType
     *
     * @param backSourceType
     */
    public void setBackSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
    }

    /**
     * get httpType
     *
     * @return
     */
    public String getHttpType() {
        return httpType;
    }

    /**
     * set httpType
     *
     * @param httpType
     */
    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }

    /**
     * get certificate
     *
     * @return
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * set certificate
     *
     * @param certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * get rsaKey
     *
     * @return
     */
    public String getRsaKey() {
        return rsaKey;
    }

    /**
     * set rsaKey
     *
     * @param rsaKey
     */
    public void setRsaKey(String rsaKey) {
        this.rsaKey = rsaKey;
    }

    /**
     * get jumpType
     *
     * @return
     */
    public String getJumpType() {
        return jumpType;
    }

    /**
     * set jumpType
     *
     * @param jumpType
     */
    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    /**
     * get certFrom
     *
     * @return
     */
    public String getCertFrom() {
        return certFrom;
    }

    /**
     * set certFrom
     *
     * @param certFrom
     */
    public void setCertFrom(String certFrom) {
        this.certFrom = certFrom;
    }

    /**
     * get sslCertId
     *
     * @return
     */
    public String getSslCertId() {
        return sslCertId;
    }

    /**
     * set sslCertId
     *
     * @param sslCertId
     */
    public void setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
    }

    /**
     * get certName
     *
     * @return
     */
    public String getCertName() {
        return certName;
    }

    /**
     * set certName
     *
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * get certType
     *
     * @return
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set certType
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * get sslCertStartTime
     *
     * @return
     */
    public String getSslCertStartTime() {
        return sslCertStartTime;
    }

    /**
     * set sslCertStartTime
     *
     * @param sslCertStartTime
     */
    public void setSslCertStartTime(String sslCertStartTime) {
        this.sslCertStartTime = sslCertStartTime;
    }

    /**
     * get sslCertEndTime
     *
     * @return
     */
    public String getSslCertEndTime() {
        return sslCertEndTime;
    }

    /**
     * set sslCertEndTime
     *
     * @param sslCertEndTime
     */
    public void setSslCertEndTime(String sslCertEndTime) {
        this.sslCertEndTime = sslCertEndTime;
    }


    /**
     * set null
     *
     * @param allStatus
     */
    public GetDomainDetailResult allStatus(String allStatus) {
        this.allStatus = allStatus;
        return this;
    }

    /**
     * set allowNoReferHeader
     *
     * @param allowNoReferHeader
     */
    public GetDomainDetailResult allowNoReferHeader(String allowNoReferHeader) {
        this.allowNoReferHeader = allowNoReferHeader;
        return this;
    }

    /**
     * set allowNullReferHeader
     *
     * @param allowNullReferHeader
     */
    public GetDomainDetailResult allowNullReferHeader(String allowNullReferHeader) {
        this.allowNullReferHeader = allowNullReferHeader;
        return this;
    }

    /**
     * set dailyBandWidth
     *
     * @param dailyBandWidth
     */
    public GetDomainDetailResult dailyBandWidth(Integer dailyBandWidth) {
        this.dailyBandWidth = dailyBandWidth;
        return this;
    }

    /**
     * set forbiddenType
     *
     * @param forbiddenType
     */
    public GetDomainDetailResult forbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
        return this;
    }

    /**
     * set maxFileSize
     *
     * @param maxFileSize
     */
    public GetDomainDetailResult maxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * set minFileSize
     *
     * @param minFileSize
     */
    public GetDomainDetailResult minFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
        return this;
    }

    /**
     * set sumFileSize
     *
     * @param sumFileSize
     */
    public GetDomainDetailResult sumFileSize(Long sumFileSize) {
        this.sumFileSize = sumFileSize;
        return this;
    }

    /**
     * set avgFileSize
     *
     * @param avgFileSize
     */
    public GetDomainDetailResult avgFileSize(Long avgFileSize) {
        this.avgFileSize = avgFileSize;
        return this;
    }

    /**
     * set referList
     *
     * @param referList
     */
    public GetDomainDetailResult referList(List<String> referList) {
        this.referList = referList;
        return this;
    }

    /**
     * set referType
     *
     * @param referType
     */
    public GetDomainDetailResult referType(String referType) {
        this.referType = referType;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public GetDomainDetailResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set cname
     *
     * @param cname
     */
    public GetDomainDetailResult cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set archiveNo
     *
     * @param archiveNo
     */
    public GetDomainDetailResult archiveNo(String archiveNo) {
        this.archiveNo = archiveNo;
        return this;
    }

    /**
     * set type
     *
     * @param type
     */
    public GetDomainDetailResult type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set created
     *
     * @param created
     */
    public GetDomainDetailResult created(String created) {
        this.created = created;
        return this;
    }

    /**
     * set modified
     *
     * @param modified
     */
    public GetDomainDetailResult modified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public GetDomainDetailResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set auditStatus
     *
     * @param auditStatus
     */
    public GetDomainDetailResult auditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * set source
     *
     * @param source
     */
    public GetDomainDetailResult source(BackSourceInfo source) {
        this.source = source;
        return this;
    }

    /**
     * set sourceType
     *
     * @param sourceType
     */
    public GetDomainDetailResult sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * set 默认的回源host
     *
     * @param defaultSourceHost
     */
    public GetDomainDetailResult defaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
        return this;
    }

    /**
     * set backSourceType
     *
     * @param backSourceType
     */
    public GetDomainDetailResult backSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
        return this;
    }

    /**
     * set httpType
     *
     * @param httpType
     */
    public GetDomainDetailResult httpType(String httpType) {
        this.httpType = httpType;
        return this;
    }

    /**
     * set certificate
     *
     * @param certificate
     */
    public GetDomainDetailResult certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * set rsaKey
     *
     * @param rsaKey
     */
    public GetDomainDetailResult rsaKey(String rsaKey) {
        this.rsaKey = rsaKey;
        return this;
    }

    /**
     * set jumpType
     *
     * @param jumpType
     */
    public GetDomainDetailResult jumpType(String jumpType) {
        this.jumpType = jumpType;
        return this;
    }

    /**
     * set certFrom
     *
     * @param certFrom
     */
    public GetDomainDetailResult certFrom(String certFrom) {
        this.certFrom = certFrom;
        return this;
    }

    /**
     * set sslCertId
     *
     * @param sslCertId
     */
    public GetDomainDetailResult sslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }

    /**
     * set certName
     *
     * @param certName
     */
    public GetDomainDetailResult certName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * set certType
     *
     * @param certType
     */
    public GetDomainDetailResult certType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * set sslCertStartTime
     *
     * @param sslCertStartTime
     */
    public GetDomainDetailResult sslCertStartTime(String sslCertStartTime) {
        this.sslCertStartTime = sslCertStartTime;
        return this;
    }

    /**
     * set sslCertEndTime
     *
     * @param sslCertEndTime
     */
    public GetDomainDetailResult sslCertEndTime(String sslCertEndTime) {
        this.sslCertEndTime = sslCertEndTime;
        return this;
    }


    /**
     * add item to referList
     *
     * @param referList
     */
    public void addReferList(String referList) {
        if (this.referList == null) {
            this.referList = new ArrayList<>();
        }
        this.referList.add(referList);
    }

}