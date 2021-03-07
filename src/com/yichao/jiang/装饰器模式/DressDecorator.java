

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
 * 装饰器类同样实现Component接口，那么使用Component的地方，均可以使用Decorator 
 * 装饰器类需要持有一个被装饰类的引用，如果仅仅会存在一种类型的装饰器，那么可以将此接口省略
 * 让具体装饰器类直接继承自Component；
 *
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class DressDecorator implements PersonI {

    private PersonI component;
    
    public DressDecorator(PersonI component) {
        this.component = component;
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.装饰器模式.PersonI#show() 
     */
    @Override
    public void show() {
        // 在装饰器类中调用被装饰类的方法
        if (component != null) {
            component.show();
        }
    }

}

