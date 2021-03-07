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

/**  
 * 表示一个作用于某对象结构中的各个元素的操作，它可以使你在不改变各个元素类的前提下，定义作用于
 * 这些元素的新操作，该模式适用于数据结构相对稳定的系统
 * <p>
 * 优点：将数据处理和数据结构解耦分离，增加新的操作（新建访问者）变得较为容易
 * 缺点: 增加新的数据结构变得比较困难
 * <p>
 * 数据结构:element;数据操作:visitor
 * 双分配：客户端将具体操作visitor作为参数传递给数据结构element，element收到这个参数后，会将自己作为参数
 * 传递给visitor
 * <p>
 * 在大话设计模式中，《男人和女人》，针对不同的状态，男人和女人元素下都会有不同的处理
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.访问者模式;