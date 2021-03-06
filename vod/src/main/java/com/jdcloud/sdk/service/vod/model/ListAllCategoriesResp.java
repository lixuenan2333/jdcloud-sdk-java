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
 * Media Category
 * 分类管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 查询所有分类
 */
public class ListAllCategoriesResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * flatResult
     */
    private List<GetCategoryResp> flatResult;

    /**
     * treeResult
     */
    private CategoryTreeNode treeResult;


    /**
     * get flatResult
     *
     * @return
     */
    public List<GetCategoryResp> getFlatResult() {
        return flatResult;
    }

    /**
     * set flatResult
     *
     * @param flatResult
     */
    public void setFlatResult(List<GetCategoryResp> flatResult) {
        this.flatResult = flatResult;
    }

    /**
     * get treeResult
     *
     * @return
     */
    public CategoryTreeNode getTreeResult() {
        return treeResult;
    }

    /**
     * set treeResult
     *
     * @param treeResult
     */
    public void setTreeResult(CategoryTreeNode treeResult) {
        this.treeResult = treeResult;
    }


    /**
     * set flatResult
     *
     * @param flatResult
     */
    public ListAllCategoriesResp flatResult(List<GetCategoryResp> flatResult) {
        this.flatResult = flatResult;
        return this;
    }

    /**
     * set treeResult
     *
     * @param treeResult
     */
    public ListAllCategoriesResp treeResult(CategoryTreeNode treeResult) {
        this.treeResult = treeResult;
        return this;
    }


    /**
     * add item to flatResult
     *
     * @param flatResult
     */
    public void addFlatResult(GetCategoryResp flatResult) {
        if (this.flatResult == null) {
            this.flatResult = new ArrayList<>();
        }
        this.flatResult.add(flatResult);
    }

}