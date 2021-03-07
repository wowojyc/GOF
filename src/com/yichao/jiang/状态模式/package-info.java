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
 * 状态模式当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类
 * 主要解决：当控制一个对象状态转换的条件分支过于复杂时，把状态的判断逻辑转移到标识不同状态的一系列类中
 * 可以把负责的判断逻辑简化
 * <p>
 * 状态模式将与特定状态相关的行为局部化，并且将不同状态的行为分割开来；通过定义新的子类，可以增加新的状态和转换
 * <p>
 * 在大话设计模式中，《无尽加班何时休》，通过状态模式实现小菜一天不同工作时间的状态
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.状态模式;