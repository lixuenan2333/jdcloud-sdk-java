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
 * ServiceConfig
 * 查询服务配置信息
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.kubernetes.model.MasterImage;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询服务配置信息，提供详细的 master 和 node 镜像信息。
 */
public class DescribeImagesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * masterImages
     */
    private List<MasterImage> masterImages;


    /**
     * get masterImages
     *
     * @return
     */
    public List<MasterImage> getMasterImages() {
        return masterImages;
    }

    /**
     * set masterImages
     *
     * @param masterImages
     */
    public void setMasterImages(List<MasterImage> masterImages) {
        this.masterImages = masterImages;
    }


    /**
     * set masterImages
     *
     * @param masterImages
     */
    public DescribeImagesResult masterImages(List<MasterImage> masterImages) {
        this.masterImages = masterImages;
        return this;
    }


    /**
     * add item to masterImages
     *
     * @param masterImage
     */
    public void addMasterImage(MasterImage masterImage) {
        if (this.masterImages == null) {
            this.masterImages = new ArrayList<>();
        }
        this.masterImages.add(masterImage);
    }

}