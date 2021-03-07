

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

package com.yichao.jiang.工厂模式;

/**
 * ConcreteProduct类实现Product接口  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class Volunteer implements LeiFeng {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.工厂模式.LeiFeng#wash() 
     */
    @Override
    public void wash() {
        // TODO Auto-generated method stub
        System.out.println("志愿者在洗衣服");
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.工厂模式.LeiFeng#sweep() 
     */
    @Override
    public void sweep() {
        // TODO Auto-generated method stub
        System.out.println("志愿者在扫地");
    }

}

