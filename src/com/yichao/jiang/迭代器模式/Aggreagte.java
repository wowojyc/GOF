

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

package com.yichao.jiang.迭代器模式;

/** 
 * 聚集抽象接口，需要提供产生迭代器的接口 
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public abstract class Aggreagte {

    /**
     * 创建集合对象的自定义迭代器
     * createIterator
     * @return
     */
    public abstract Iterator createIterator();
}

