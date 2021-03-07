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

package com.yichao.jiang.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供一个高层的接口，以便访问者可以访问到它的元素
 * 
 * @author yichao.jiang
 * @version 2016年5月26日
 * @since jdk 1.8 or after
 */
public class ObjectStructer {

    /**
     * 持有所有的elements
     */
    private List<Person> persons = new ArrayList<Person>();

    /**
     * 添加elements
     * 
     * @param person
     */
    public void addElement(Person person) {
        this.persons.add(person);
    }

    /**
     * 移除elements removeElement
     * 
     * @param person
     */
    public void removeElement(Person person) {
        this.persons.remove(person);
    }
    
    /**
     * 对所有的元素进行遍历
     * @param action
     */
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
