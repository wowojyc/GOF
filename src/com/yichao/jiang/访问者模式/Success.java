
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

package com.yichao.jiang.访问者模式;

/**
 * 成功时的操作
 * 
 * @author yichao.jiang
 * @version 2016年5月26日
 * @since jdk 1.8 or after
 */
public class Success extends Action {

    /*
     * (non-Javadoc)
     * 
     * @see com.yichao.jiang.访问者模式.Action#getManConclusion(com.yichao.jiang.访问者模式.Man)
     */
    @Override
    public void getManConclusion(Man man) {
        // TODO Auto-generated method stub
        System.out.println(man.getClass().getName() + this.getClass().getName() + "时，背后多半有一个伟大的女人");
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yichao.jiang.访问者模式.Action#getWomenConclusion(com.yichao.jiang.访问者模式.Woman)
     */
    @Override
    public void getWomenConclusion(Woman woman) {
        // TODO Auto-generated method stub
        System.out.println(woman.getClass().getName() + this.getClass().getName() + "时，背后大多有一个不成功的男人");
    }

}
