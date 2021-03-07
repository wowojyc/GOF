

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

/**  
 * 模拟客户端调用
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ObjectStructer structer = new ObjectStructer();
        structer.addElement(new Man());
        structer.addElement(new Woman());
        
        Success successAction = new Success();
        structer.display(successAction);
        
        // 如果要修改对元素的操作，只需要继承Action接口，实现新的操作即可
        Fail failAction = new Fail();
        structer.display(failAction);
        
    }

}

