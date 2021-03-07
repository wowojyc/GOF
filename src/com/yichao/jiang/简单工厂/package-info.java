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
 * 简单工厂违背了开放-关闭原则
 * 因为如果要增加新的操作类型，需要修改SimpleFactory里面的逻辑，生成具体的操作类 
 * <p>
 * 对于工厂而言，封装了对象的具体创建过程，对于用户来说是黑盒的
 * <p>
 * 在大话设计模式中，简单模式对应的例子是小菜去一个公司面试，题目是写一个简单的计算器
 * @author yichao.jiang 
 * @version  2016年5月9日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.简单工厂;