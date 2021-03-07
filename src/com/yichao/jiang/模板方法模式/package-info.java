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
 * 定义一个操作中的算法骨架，将一些步骤延迟到子类中。模板方法模式使得子类可以不改变一个
 * 算法的结构即可重定义该算法的某些特定步骤
 * <p>
 * 当需要完成层次一致的一个过程或者一系列步骤，但这些步骤在更细粒度上的实现可能不同时，需要考虑模板方法模式
 * <p>
 * 当不变和可变的行为在方法的子类实现中混合在一起时，不变的行为就会在多个子类中重复，需要将这些行为移动到单一的地方
 * 帮助子类摆脱重复的不变行为
 * <p>
 * 在大话设计模式中，《考题抄错会做也白搭》，对于同一套试卷，每个人仅仅是答案存在差异，但是答题的步骤是固定的
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.模板方法模式;