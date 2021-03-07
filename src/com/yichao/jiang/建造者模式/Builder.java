

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
 * 构建者接口，指定构建产品每一部分的接口，同时需要指定获取产品建造结果的接口
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public interface Builder {
    
    /**
     * 建造产品的颜色部分
     */
    public void buildColor();
    
    /**
     * 建造产品的形状部分
     */
    public void buildShape();
    
    /**
     * 将建造好的产品返回
     * buildProduct
     * @return
     */
    public Product buildProduct();
}

