

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

import java.util.ArrayList;
import java.util.List;

/**  
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public class ConcreteAggreate extends Aggreagte {
    
    private List<Object> items = new ArrayList<Object> ();
    
    public Object get(int index) {
        return items.get(index);
    }
    
    public void remove(int index) {
         items.remove(index);
    }
    
    public int size() {
        return this.items.size();
    }
    
    public void add(Object obj) {
        this.items.add(obj);
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.迭代器模式.Aggreagte#createIterator() 
     */
    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new AggreagteIterator(this);

    }

}

