

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

package com.yichao.jiang.组合模式;

/**  
 * Component接口，leaf或者组合节点必须实现其接口
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public abstract class Company {
    
    protected String name;
    
    public Company(String name) {
        this.name = name;
    }
    
    /**
     * 增加节点
     * addCompany
     * @param company
     */
    public abstract void addCompany(Company company);
    
    /**
     * 删除节点
     * removeCompany
     * @param company
     */
    public abstract void removeCompany(Company company);
    
    /**
     * 履行职责
     * LineOfDuty
     */
    public abstract void LineOfDuty(); 
    
    /**
     * 展示结果
     * display
     * @param depth
     */
    public abstract void display(int depth);
}

