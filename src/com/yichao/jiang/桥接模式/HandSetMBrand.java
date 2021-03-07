

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
 * M牌手机
 * @author yichao.jiang 
 * @version  2016年5月19日 
 * @since jdk 1.8 or after
 */
public class HandSetMBrand extends HandSetBrand {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.桥接模式.HandSetBrand#run() 
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("M牌手机");
        // 运行软件
        soft.run();
    }

}

