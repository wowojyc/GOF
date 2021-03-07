

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

package com.yichao.jiang.状态模式;

/**  
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class AfternoonState implements State {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.状态模式.State#handleContext(com.yichao.jiang.状态模式.WorkContext) 
     */
    @Override
    public void handleContext(WorkContext context) {
        // TODO Auto-generated method stub
        if (context.getWorkHour() > 18) {
            // 状态转移
            context.setState(new EveingState());
//            context.handle();
        } else {
            System.out.println("下午有些困");
        }
    }

}

