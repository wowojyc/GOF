

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
 * context，持有一个State引用，在各个State之间传递
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class WorkContext {
    private boolean workFinished;
    private int workHour;
    // 默认是早上的状态
    private State state = new MorningState();
    
    public boolean isWorkFinished() {
    
        return workFinished;
    }
    public void setWorkFinished(boolean workFinished) {
    
        this.workFinished = workFinished;
    }
    public State getState() {
    
        return state;
    }
    public void setState(State state) {
    
        this.state = state;
    }
    
    /**
     * 开始处理
     * handle
     */
    public void handle() {
        this.state.handleContext(this);
    }
    
    /** 
     * 获取 workHour 
     * @return the workHour 
     */
    public int getWorkHour() {
        
        return workHour;
        
    }
    
    /** 
     * 设置 workHour 
     * @param workHour the workHour to set 
     */
    public void setWorkHour(int workHour) {
        
        this.workHour = workHour;
        
    }
}

