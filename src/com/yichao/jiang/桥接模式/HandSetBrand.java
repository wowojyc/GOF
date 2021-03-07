

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

package com.yichao.jiang.桥接模式;

/**  
 * 手机品牌抽象类
 * @author yichao.jiang 
 * @version  2016年5月19日 
 * @since jdk 1.8 or after
 */
public abstract class HandSetBrand {
    
    /**
     * 持有一个手机软件，
     */
    protected HandSetSoft soft;

    /** 
     * 获取 soft 
     * @return the soft 
     */
    public HandSetSoft getSoft() {
    
        return soft;
    }

    /** 
     * 设置 soft 
     * @param soft the soft to set 
     */
    public void setSoft(HandSetSoft soft) {
    
        this.soft = soft;
    }
    
    public abstract void run();
}

