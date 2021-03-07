

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

package com.yichao.jiang.访问者模式;

/**  
 * element数据结构的基类
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public abstract class Person {
    
    /**
     * 每个element都需要实现该方法，接收一个Visitor操作，并将自身传递给该Visitor
     * accept
     * @param action
     */
    public abstract void accept(Action action);
}

