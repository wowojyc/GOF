

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

package com.yichao.jiang.解释器模式;

/**  
 * 终结符表达式 音阶类
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public class Scale extends Expression {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.解释器模式.Expression#execute(java.lang.String, double) 
     */
    @Override
    public void execute(String playKey, double playValue) {
        // TODO Auto-generated method stub
        String scale = "";
        switch (String.valueOf(playValue)) {
            case "1.0":
                scale = "低音";
                break;
            case "2.0":
                scale = "中音";
                break;
            case "3.0":
                scale = "高音";
                break;
        }
        System.out.print(scale);
    }

}

