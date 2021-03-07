

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
 * 具体构建者，针对建造过程的细节予以特殊实现 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class ConcreteBuilder1 implements Builder {

    /**
     * 待建造产品对象
     */
    private Product product;
    
    public ConcreteBuilder1() {
        product = new Product();
    }
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.建造者模式.Builder#buildPartA() 
     */
    @Override
    public void buildColor() {
        // TODO Auto-generated method stub
        product.addPart("黄色");
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.建造者模式.Builder#buildPartB() 
     */
    @Override
    public void buildShape() {
        // TODO Auto-generated method stub
        product.addPart("长方形");
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.建造者模式.Builder#buildProduct() 
     */
    @Override
    public Product buildProduct() {
        // 将建造好的商品返回
        return product;

    }

}

