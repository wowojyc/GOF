

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
 * 高级技术经理
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class SeniorTechManager extends Manager {

    /** 
     * 构造函数
     */
    public SeniorTechManager(String name, String level) {
        // TODO Auto-generated constructor stub
        super(name, level);

    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.职责链模式.Manager#handleRequest(com.yichao.jiang.职责链模式.Request) 
     */
    @Override
    public void handleRequest(Request request) {
        // TODO Auto-generated method stub
     // TODO Auto-generated method stub
        if (request.getDays() <= 20) {
            // 如果自己有权限处理，则处理
            System.out.println(this.level + this.name + "通过了" + request.getName() + "的" + request.getDays() + "天假");
        } else {
            // 如果自己没有权限处理，则交给上级处理
            this.successor.handleRequest(request);
        }
    }

}

