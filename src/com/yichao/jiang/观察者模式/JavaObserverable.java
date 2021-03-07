

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

import java.util.Observable;

/**  
 * 基于java内部的Observable类实现观察者模式
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class JavaObserverable extends Observable {
    String message = "";
    
    public void setMessage(String message) {
        this.message = message;
        this.setChanged(); // 标记此Observable对象为已改变对象
        this.notifyObservers(); // 通知所有观察者
        // this.notifyObservers(arg); arg作为参数传递给观察者
    }
}

