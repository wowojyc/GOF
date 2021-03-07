

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
 * 继承抽象操作，实现除法操作，在这里可以单独对除法相关的操作
 * 进行校验，比如除数不可以为0
 * @author yichao.jiang 
 * @version  2016年5月9日 
 * @since jdk 1.8 or after
 */
public class DivideOperation extends Operation {

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculate(int numberA, int numberB) {
        try {
            // 针对除数为0的情况，需要做处理
            return numberA / numberB;
        } catch (Exception e) {
            throw e;
        }
        
    }
}

