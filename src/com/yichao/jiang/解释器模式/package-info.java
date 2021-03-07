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
 * 解释器模式：定义一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示解释语言中的
 * 句子
 * <p>
 * 如果一种特定类型的问题频繁发生，那么可以将该问题的各个实例表述为简单语言中的一个句子，进而构建一个解释器
 * 该解释器通过解释这些句子来解决该问题
 * <p>
 * 通常当一个语言需要解释执行时，并且可以将该语言中的句子表述为一个抽象语法树时，可以使用解释器模式
 * <p>
 * 优点:容易改变和扩展文法,因为使用类来表述文法规则，所以可以基于继承等方式实现文法修改和扩展
 * 缺点：由于文法中的每一条规则都必须至少定义一个类，当文法较为复杂时，难以管理和维护
 * <p>
 * 大话设计模式中，《其实你不懂老板的心》，小菜希望能够提供一个解释器，以便明白老板话背后的含义
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.解释器模式;