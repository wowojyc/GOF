

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

package com.yichao.jiang.策略模式;

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
        CashNormal cashNormal = new CashNormal();
        CashContext context = new CashContext(cashNormal);
        System.out.println(context.cashResult(10000));
        
        // 更换算法，但是调用方式不需要改变
        context = new CashContext(new CashRebate(0.8));
        System.out.println(context.cashResult(10000));
    }

    // 将策略模式和简单工厂模式结合
    // 通过工厂方法，生成对应的strategy context
    public CashContext createCashContext(String type) {
        switch (type) {
            case "正常收费":
                return new CashContext(new CashNormal());
            case "打8折":
                return new CashContext(new CashRebate(0.8));
            default:
                throw new UnsupportedOperationException(type + "操作暂不支持.");
        }
    }
    
    public void testFactory() {
        CashContext context = createCashContext("正常收费");
        System.out.println(context.cashResult(10000));
    }
}

