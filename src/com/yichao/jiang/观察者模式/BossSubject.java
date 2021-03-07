

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

import java.util.ArrayList;
import java.util.List;

/**  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class BossSubject extends Subject {
    
    private String name;
    
    private List<Observer> observers = new ArrayList<Observer>();
    
    public BossSubject(String name) {
        this.setName(name);
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.观察者模式.Subject#register(com.yichao.jiang.观察者模式.Observer) 
     */
    @Override
    public void register(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.观察者模式.Subject#unRegister(com.yichao.jiang.观察者模式.Observer) 
     */
    @Override
    public void unRegister(Observer observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.观察者模式.Subject#notifyAllObserver() 
     */
    @Override
    public void notifyAllObserver() {
        // TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.notifyNotice();
        }
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

}

