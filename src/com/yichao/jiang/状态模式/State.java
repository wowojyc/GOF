

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
 * 定义一个状态接口，提供处理各个状态的接口，该接口处理在各个状态之间传递的上下文 
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public interface State {
    /**
     * 获取上下文中的状态信息进行处理
     * handleContext
     * @param context
     */
    public void handleContext(WorkContext context);
}

