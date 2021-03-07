

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

package com.yichao.jiang.职责链模式;

/**  
 * 请求对象，以请假请求为例
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Request {

    /**
     * 请假人姓名
     */
    private String name;
    
    /**
     * 请假天数
     */
    private int days;
    
    public Request(String name, int days) {
        this.name = name;
        this.days = days;
    }

    /** 
     * 获取 name 
     * @return the name 
     */
    public String getName() {
    
        return name;
    }

    /** 
     * 设置 name 
     * @param name the name to set 
     */
    public void setName(String name) {
    
        this.name = name;
    }

    /** 
     * 获取 days 
     * @return the days 
     */
    public int getDays() {
    
        return days;
    }

    /** 
     * 设置 days 
     * @param days the days to set 
     */
    public void setDays(int days) {
    
        this.days = days;
    }
    
}

