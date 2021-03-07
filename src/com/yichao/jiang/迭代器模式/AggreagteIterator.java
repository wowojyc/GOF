

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

package com.yichao.jiang.迭代器模式;




/**  
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public class AggreagteIterator extends Iterator {

    /**
     * 迭代器需持有待遍历的对象
     */
    private ConcreteAggreate aggregate;
    public AggreagteIterator(ConcreteAggreate aggregate) {
        // TODO Auto-generated constructor stub
        this.aggregate = aggregate;
    }
    
    int current = 0;
    @Override
    public Object first() {
        // TODO Auto-generated method stub
        return this.aggregate.get(0);
        
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        Object ret = null;
        current++;
        if (current < this.aggregate.size()) {
            ret = this.aggregate.get(current);
        }
        return ret;
        
    }

    @Override
    public boolean isDone() {
        // TODO Auto-generated method stub
        return this.current >= this.aggregate.size() ? true : false;
        
    }

    @Override
    public Object currentItem() {
        // TODO Auto-generated method stub
        return this.aggregate.get(current);
        
    }
    

}

