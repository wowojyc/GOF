

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
 * 该子类实现工厂接口，创建某一个ConcreteProduct对象  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class UnderGraduateFactory implements Factory {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.工厂模式.Factory#createLeiFeng() 
     */
    @Override
    public LeiFeng createLeiFeng() {
        // TODO Auto-generated method stub
        return new UnderGraduate();
    }

}

