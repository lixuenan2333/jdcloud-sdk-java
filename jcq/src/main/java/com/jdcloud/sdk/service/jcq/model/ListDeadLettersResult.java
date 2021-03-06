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
 * DeadLetter
 * 死信队列相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jcq.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jcq.model.DeadLetter;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 死信队列列表
 */
public class ListDeadLettersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * deadLetters
     */
    private List<DeadLetter> deadLetters;

    /**
     * 总数
     */
    private Integer totalCount;


    /**
     * get deadLetters
     *
     * @return
     */
    public List<DeadLetter> getDeadLetters() {
        return deadLetters;
    }

    /**
     * set deadLetters
     *
     * @param deadLetters
     */
    public void setDeadLetters(List<DeadLetter> deadLetters) {
        this.deadLetters = deadLetters;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set deadLetters
     *
     * @param deadLetters
     */
    public ListDeadLettersResult deadLetters(List<DeadLetter> deadLetters) {
        this.deadLetters = deadLetters;
        return this;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public ListDeadLettersResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to deadLetters
     *
     * @param deadLetter
     */
    public void addDeadLetter(DeadLetter deadLetter) {
        if (this.deadLetters == null) {
            this.deadLetters = new ArrayList<>();
        }
        this.deadLetters.add(deadLetter);
    }

}