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

package com.jdcloud.sdk.service.cdn.model;


/**
 * domainSourceInfo
 */
public class DomainSourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * priority
     */
    private Integer priority;

    /**
     * sourceHost
     */
    private String sourceHost;

    /**
     * domain
     */
    private String domain;


    /**
     * get priority
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set priority
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * get sourceHost
     *
     * @return
     */
    public String getSourceHost() {
        return sourceHost;
    }

    /**
     * set sourceHost
     *
     * @param sourceHost
     */
    public void setSourceHost(String sourceHost) {
        this.sourceHost = sourceHost;
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
     * set priority
     *
     * @param priority
     */
    public DomainSourceInfo priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set sourceHost
     *
     * @param sourceHost
     */
    public DomainSourceInfo sourceHost(String sourceHost) {
        this.sourceHost = sourceHost;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public DomainSourceInfo domain(String domain) {
        this.domain = domain;
        return this;
    }


}