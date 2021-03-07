

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

package com.yichao.jiang.桥接模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月19日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HandSetSoft soft = new HandSetGame();
        HandSetBrand nBrand = new HandSetNBrand();
        nBrand.setSoft(soft);
        nBrand.run();
        // 一个软件可以在多个手机品牌上运行
        HandSetBrand mBrand = new HandSetMBrand();
        mBrand.setSoft(soft);
        mBrand.run();
    }

}

