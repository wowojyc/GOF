

/**
 *  .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yichao.jiang.解释器模式;

/** 
 * 包含解释器之外的一些全局信息 
 * 本程序以音乐解释器为例
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public class PlayContext {

    /**
     * 演奏的内容
     */
    private String playText;

    /** 
     * 获取 playText 
     * @return the playText 
     */
    public String getPlayText() {
    
        return playText;
    }

    /** 
     * 设置 playText 
     * @param playText the playText to set 
     */
    public void setPlayText(String playText) {
    
        this.playText = playText;
    }
}

