

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

package com.yichao.jiang.建造者模式;

/**  
 * 指挥者，确定产品的建造过程，持有一个建造者引用
 * 通过这个建造者完成产品建造过程
 * <p>
 * Director仅负责确定产品建造过程，具体产品的产生和最终的获取应该交给Builder完成
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class Director {
    
    private Builder builder;
    
    /**
     * 指定构建者
     * 构造函数
     */
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * 确定建造过程，该过程一般相对稳定
     * buildProduct
     */
    public void buildProduct() {
        builder.buildColor();
        builder.buildShape();
    }
}

