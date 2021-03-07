

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

package com.yichao.jiang.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class JavaObserver implements Observer {

    /*
     * (non-Javadoc) 
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object) 
     */
    @Override
    public void update(Observable o, Object arg) {
        // 当使用notifyObservers(arg), arg即为参数
        JavaObserverable obj = (JavaObserverable) o;
        System.out.println(obj.message);
    }

}

