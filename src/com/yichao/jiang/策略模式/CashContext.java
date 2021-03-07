

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
 * Strategy context，将客户端和具体算法解耦
 * 持有一个Strategy的引用，并在公有方法中调用具体策略对应的方法 
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class CashContext {

    /**
     * Strategy 引用
     */
    private CashSuper cashStrategy;
    
    public CashContext(CashSuper cashStrategy) {
        this.cashStrategy = cashStrategy;
    }
    
    /**
     * 对外暴露的接口
     * cashResult
     * @param money
     * @return
     */
    public double cashResult(double money) {
        // TODO 此处可以加一些同算法无关的公共操作
        // 调用具体的算法
        return cashStrategy.cashResult(money);
    }
    
}

