

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

/** 
 * 具体观察者对象 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        // TODO Auto-generated constructor stub
        super(name, subject);
        
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.观察者模式.Observer#notifyNotice() 
     */
    @Override
    public void notifyNotice() {
        // TODO Auto-generated method stub
        System.out.println("关闭股票页面");
    }

}

