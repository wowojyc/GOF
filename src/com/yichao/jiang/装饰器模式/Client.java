

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

package com.yichao.jiang.装饰器模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person("client");
        // 这个顺序是随机的，可以穿帽子->鞋子->T恤衫，也可以是其他的顺序
        // 对Person装饰了帽子
        HatDecorator hatDecorator = new HatDecorator(person);
        // 对装饰了帽子后的Person继续装饰鞋子
        ShoesDecorator shoesDecorator = new ShoesDecorator(hatDecorator);
        // 对装饰了帽子和帽子后的Person继续装饰T恤衫
        TShirtDecorator tShirtDecorator = new TShirtDecorator(shoesDecorator);
        tShirtDecorator.show();
    }

}

