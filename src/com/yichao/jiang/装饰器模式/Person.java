

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
 * ConcreteComponent，实现Component接口，并予以实现
 * 如果只有一种ConcretComponent，那么可以省略Component接口，直接使用ConcretComponent
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class Person implements PersonI {

    private String name;
    public Person(String name) {
        this.name = name;
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.装饰器模式.PersonI#show() 
     */
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("装扮的" + name);
    }

}

