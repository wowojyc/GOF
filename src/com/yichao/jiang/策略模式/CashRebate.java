

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
 * 打折算法实现
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class CashRebate implements CashSuper {

    /**
     * 打折比例
     */
    private double rebate;
    
    public CashRebate(double rebate) {
        this.rebate = rebate;
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.策略模式.CashSuper#cashResult(double) 
     */
    @Override
    public double cashResult(double money) {
        // TODO Auto-generated method stub
        return money * rebate;
    }
}

