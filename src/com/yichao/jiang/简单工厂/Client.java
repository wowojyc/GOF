

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
 * 模拟客户端操作
 * @author yichao.jiang 
 * @version  2016年5月9日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        
        int numberA = 10;
        int numberB = 20;
        
        Operation operation = SimpleFactory.createOperation("add");
        System.out.println(operation.calculate(numberA, numberB));
        
        operation = SimpleFactory.createOperation("divide");
        System.out.println(operation.calculate(numberA, numberB));
        
//        // 除数不能为0
//        operation = SimpleFactory.createOperation("divide");
//        System.out.println(operation.calculate(numberA, 0));
//        
//        // 乘法暂时不支持
//        operation = SimpleFactory.createOperation("multiply");
//        System.out.println(operation.calculate(numberA, numberB));
    }

}

