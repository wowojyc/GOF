

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

package com.yichao.jiang.适配器模式;

/** 
 * 需要被适配的类，adaptee
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class ForeignPlayer {
    private String name;
    
    public ForeignPlayer(String name) {
        this.name = name;
    }
    

    
    /** 
     * 获取 name 
     * @return the name 
     */
    public String getName() {
        
        return name;
        
    }

    
    /** 
     * 设置 name 
     * @param name the name to set 
     */
    public void setName(String name) {
        
        this.name = name;
        
    }
    
    public void 进攻() {
        System.out.println("外籍中锋进攻!");
    }
    
    public void 防守() {
        System.out.println("外籍中锋防守!");
    }
}

