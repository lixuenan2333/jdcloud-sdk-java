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

package com.jdcloud.sdk.service.mongodb.model;


/**
 * flavor
 */
public class Flavor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CPU核数
     */
    private Integer cpu;

    /**
     * 内存 ,单位GB
     */
    private Integer memory;

    /**
     * iops
     */
    private Integer iops;

    /**
     * 最大连接数
     */
    private Integer maxLink;

    /**
     * 最大磁盘数,单位GB
     */
    private Integer maxDisk;

    /**
     * 最下磁盘数,单位GB
     */
    private Integer minDisk;

    /**
     * 磁盘步长
     */
    private Integer diskStep;


    /**
     * get CPU核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set CPU核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * get 内存 ,单位GB
     *
     * @return
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * set 内存 ,单位GB
     *
     * @param memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * get iops
     *
     * @return
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * set iops
     *
     * @param iops
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * get 最大连接数
     *
     * @return
     */
    public Integer getMaxLink() {
        return maxLink;
    }

    /**
     * set 最大连接数
     *
     * @param maxLink
     */
    public void setMaxLink(Integer maxLink) {
        this.maxLink = maxLink;
    }

    /**
     * get 最大磁盘数,单位GB
     *
     * @return
     */
    public Integer getMaxDisk() {
        return maxDisk;
    }

    /**
     * set 最大磁盘数,单位GB
     *
     * @param maxDisk
     */
    public void setMaxDisk(Integer maxDisk) {
        this.maxDisk = maxDisk;
    }

    /**
     * get 最下磁盘数,单位GB
     *
     * @return
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    /**
     * set 最下磁盘数,单位GB
     *
     * @param minDisk
     */
    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    /**
     * get 磁盘步长
     *
     * @return
     */
    public Integer getDiskStep() {
        return diskStep;
    }

    /**
     * set 磁盘步长
     *
     * @param diskStep
     */
    public void setDiskStep(Integer diskStep) {
        this.diskStep = diskStep;
    }


    /**
     * set CPU核数
     *
     * @param cpu
     */
    public Flavor cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 内存 ,单位GB
     *
     * @param memory
     */
    public Flavor memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * set iops
     *
     * @param iops
     */
    public Flavor iops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * set 最大连接数
     *
     * @param maxLink
     */
    public Flavor maxLink(Integer maxLink) {
        this.maxLink = maxLink;
        return this;
    }

    /**
     * set 最大磁盘数,单位GB
     *
     * @param maxDisk
     */
    public Flavor maxDisk(Integer maxDisk) {
        this.maxDisk = maxDisk;
        return this;
    }

    /**
     * set 最下磁盘数,单位GB
     *
     * @param minDisk
     */
    public Flavor minDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /**
     * set 磁盘步长
     *
     * @param diskStep
     */
    public Flavor diskStep(Integer diskStep) {
        this.diskStep = diskStep;
        return this;
    }


}