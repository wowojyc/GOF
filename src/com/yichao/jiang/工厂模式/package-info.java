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
 * 工厂模式定义了一个创建对象的接口，将具体对象的实例化推迟到子类决定
 * 工厂模式将简单工厂中的判断逻辑转移到了客户端，避免了简单工厂模式违背的开放-封闭原则
 * 缺点：如果要产生一个新的对象，则必须新建具体的对象和创建该对象相应的工厂
 * <p>
 * 在大话设计模式中，工厂模式对应的是雷锋依然在人间，雷锋可以是普通的同学，也可以是社区志愿者
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.工厂模式;