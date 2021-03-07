

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
 * 翻译官，相当于Adapter
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class Translator extends Player {

    /**
     * 持有待适配的对象
     */
    private ForeignPlayer player;
    
    public Translator(String name) {
        super(name);
        player = new ForeignPlayer(name);
    }
    
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        player.进攻();
    }

    @Override
    public void defend() {
        // TODO Auto-generated method stub
        player.防守();
    }

}

