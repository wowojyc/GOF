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
 * 提供一种方法顺序访问聚集对象中的各个元素，而不会暴露该对象的内部表示
 * 为实现该功能，需提供如开始、下一个、是否结束、当前项等统一接口
 * 迭代器模式分离了集合对象的遍历行为，不会暴露集合的内部结构，又可以允许外部访问集合数据
 * <p>
 * 在大话设计模式中，《想走，可以，先买票》，是说公交车上的售票员，无论对方是人还是物，工作人员还是小偷等
 * 都必须买票，也就是说每个车上的人都必须遍历到
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.迭代器模式;