

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

package com.yichao.jiang.简单工厂;

/**  
 * 抽象操作类
 * @author yichao.jiang 
 * @version  2016年5月9日 
 * @since jdk 1.8 or after
 */
public abstract class Operation {
    /**
     * 定义抽象操作，需由相应的子类予以实现
     * calculate
     * @param numberA
     * @param numberB
     * @return
     */
    public abstract int calculate(int numberA, int numberB);
}

