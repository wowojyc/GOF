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
 * 使多个对象都有可能处理请求，并且客户端并不会知道究竟是哪一个对象处理了请求;
 * 避免了请求发起者和请求接收者之间的耦合关系，将这些对象连接成一个链，请求会逐层传递，直到有对象可以处理或者走完
 * 整个流程都无法处理；
 * 将处理请求的职责划分，避免单个对象职责过于臃肿.
 * <p>
 * 在大话设计模式中，《加薪非要老总批》，无论是加薪或者是请假，都可以看做是一个职责链的请求
 * 在小菜的第一版代码中，有非常多的if-else分支去判断职责，代码过长就会有坏味道
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.职责链模式;