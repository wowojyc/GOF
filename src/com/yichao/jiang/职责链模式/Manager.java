

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
 * 管理者
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public abstract class Manager {

    /**
     * 管理者姓名
     */
    protected String name;
    
    /**
     * 管理者级别
     */
    protected String level;
    
    /**
     * 上级领导者
     */
    protected Manager successor;
    
    public Manager(String name, String level) {
        this.name = name;
        this.level = level;
    }
    
    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }
    
    /**
     * 处理请求
     * @param request
     */
    public abstract void handleRequest(Request request);
}

