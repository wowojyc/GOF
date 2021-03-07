

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

package com.yichao.jiang.备忘录模式;

/** 
 * 保存好备忘录，不能对备忘录内容进行操作和检查，负责将备忘录传递给其他对象， 
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class RoleCareTaker {
    private RoleMemento memento;
    public RoleCareTaker() {
        
    }
    
    /** 
     * 获取 memento 
     * @return the memento 
     */
    public RoleMemento getMemento() {
        
        return memento;
        
    }
    
    /** 
     * 设置 memento 
     * @param memento the memento to set 
     */
    public void setMemento(RoleMemento memento) {
        
        this.memento = memento;
        
    }
    
}

