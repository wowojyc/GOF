

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

package com.yichao.jiang.外观模式;

/**  
 * 外观类，持有各个子系统的引用，并提供简单接口
 * 接收客户端调用，并将起转为合适的子系统处理;
 * 相反，子系统不应该持有Facade
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    
    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }
    
    /**
     * 提供比子系统更加简单的接口调用
     * methodOne
     */
    public void methodOne() {
        one.methodOne();
        two.methodTwo();
    }
    
    /**
     * 提供比子系统更加简单的接口调用
     * methodTwo
     */
    public void methodTwo() {
        two.methodTwo();
        one.methodOne();
    }
}

