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

/** 将抽象部分和实现部分分离，使它们都能独立的变化?????
 *  实现指的是抽象类和它的派生类用来实现自己的对象
 *  在桥接模式中体现的是合成/聚合复用原则，有些时候组合会比继承更加适合
 *  <p>
 *  聚合：弱拥有，体现的是A包含B，但B并不一定是A的一部分（大雁和雁群）
 *  合成：强拥有，严格的部分和整体的关系，部分和整体的生命周期一致(大雁和翅膀)
 *  <code>
 *  <pre>
 *  public class Head {  
 *    private Mouth mouth;  
 *   public Head() {  
 *       mouth = new Mouth();  
 *    }  
 *  }  
 *   public class Mouth {  
 *    }  
 *   </pre>
 *   在Head创建时，Mouth也会创建，离开Head，Mouth不会单独存在（直接new Mouth）
 *  </code>
 *  <code>
 *  <pre>
 *  public class Car {  
 *   private Engine engine;  
 *   public Car(Engine engine) {  
 *       this.engine = engine;  
 *  }  
 *  public void setEngine(Engine engine) {  
 *      this.engine = engine;  
 *  }  
 *}  
 * public class Engine {  
 * } 
 *  </pre>
 *  通常会提供一个set方法，设置属性
 *  </code>
 *  <p>
 *  在大话设计模式中，《手机软件何时统一》
 *  背景：小菜N牌手机上有一款游戏，大鸟的M牌手机因为和小菜的手机型号不一致而无法安装
 *  第一版设计：
 *  父类为手机游戏，子类分别为N牌手机游戏和M牌手机游戏
 *  问题：如果要增加新的功能，如通讯录，则该继承结构无法实现
 *  <p>
 *  第二版设计：
 *  父类是手机品牌，子类为M牌手机和N牌手机，然后每一款手机都有对应的游戏和通讯录功能
 *  问题：1.如果要增加一个MP3的功能，那么每一款手机都需要增加一个子类；
 *       2.如果要增加一个新的手机品牌S，那么需要增加S牌手机、游戏、通讯录功能
 *       3.不同手机品牌之间的功能可能基本类似，比如M牌手机的通讯录和N牌手机的通讯录功能不会相差太多
 * 
 * <p>
 * 最终设计：
 * 提供两个抽象类，一个是手机品牌，子类为M牌手机和N牌手机；另一个为手机软件，子类为游戏和通讯录；
 * 手机品牌和软件之间应该是聚合关系，弱拥有；
 * 此时，如果新增软件或者新增手机品牌都不会对另外一个方面产生影响
 * @author yichao.jiang 
 * @version  2016年5月19日 
 * @since jdk 1.8 or after
 */
package com.yichao.jiang.桥接模式;