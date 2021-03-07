

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

package com.yichao.jiang.建造者模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Builder builder = new ConcreteBuilder1();
        // Director仅负责确定产品建造过程，具体产品的产生和最终的获取应该交给Builder完成
        Director director = new Director(builder);
        director.buildProduct();
        // 具体产品的产生和最终的获取应该交给Builder完成
        Product product = builder.buildProduct();
        product.show();
    }

}

