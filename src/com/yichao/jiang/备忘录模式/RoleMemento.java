

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

package com.yichao.jiang.备忘录模式;

/** 
 * 备忘录，负责存储发起者对象的内部状态
 * 并防止Originator之外的对象访问Memento 
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class RoleMemento {
    
    private int vit;
    private int atk;
    private int def;
    public int getVit() {
    
        return vit;
    }
    public void setVit(int vit) {
    
        this.vit = vit;
    }
    public int getAtk() {
    
        return atk;
    }
    public void setAtk(int atk) {
    
        this.atk = atk;
    }
    public int getDef() {
    
        return def;
    }
    public void setDef(int def) {
    
        this.def = def;
    }
    public RoleMemento (int vit , int atk , int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}

