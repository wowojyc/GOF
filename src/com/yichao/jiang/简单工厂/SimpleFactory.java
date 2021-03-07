

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
 * 简单工厂类，通过客户端指定的参数，生成对应的操作
 * @author yichao.jiang 
 * @version  2016年5月9日 
 * @since jdk 1.8 or after
 */
public class SimpleFactory {
    
    /**
     * 根据用户操作返回具体的实例
     * createOperation
     * @param calculateType
     * @return
     */
    public static Operation createOperation(String calculateType) {
        switch (calculateType) {
            case "add":
                return new AddOperation();
            case "divide":
                return new DivideOperation();
            default:
                throw new UnsupportedOperationException(calculateType + " is not supported.");
        }
    }
}

