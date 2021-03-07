

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
 * 主题接口，该接口中应该提供新增、移除、通知观察者的功能接口
 * 同时应持有主题状态  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public abstract class Subject {
    
    /**
     * 注册观察者
     * register
     * @param observer
     */
    public abstract void register(Observer observer); 
    
    /**
     * 移除观察者
     * unRegister
     * @param observer
     */
    public abstract void unRegister(Observer observer);
    
    /**
     * 通知所有的观察者
     * notifyAllObserver
     */
    public abstract void notifyAllObserver();
}

