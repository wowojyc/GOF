

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

package com.yichao.jiang.职责链模式;

/**  
 * 模拟客户端调用
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        Manager x = new TechManager("x", "技术经理");
        Manager l = new SeniorTechManager("l", "高级技术经理");
        Manager m = new ChiefManager("m", "总监");
        Request request = new Request("小明", 10);
        
        x.setSuccessor(l);
        l.setSuccessor(m);
        
        x.handleRequest(request);
    }

}

