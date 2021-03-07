

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

package com.yichao.jiang.观察者模式;

/**  
 * 观察者接口，需要持有一个主题对象，以便获取主题对象的状态
 * 同时需要提供notifyNotice接口，供主题对象通知使用
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public abstract class Observer {
    
    private String name;
    private Subject subject;
    
    public Observer(String name, Subject subject) {
        this.setName(name);
        this.setSubject(subject);
    }
    
    /**
     * 通知接口，供主题对象调用
     */
    public abstract void notifyNotice();

    
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
     * 获取 subject 
     * @return the subject 
     */
    public Subject getSubject() {
        
        return subject;
        
    }

    
    /** 
     * 设置 subject 
     * @param subject the subject to set 
     */
    public void setSubject(Subject subject) {
        
        this.subject = subject;
        
    }
}

