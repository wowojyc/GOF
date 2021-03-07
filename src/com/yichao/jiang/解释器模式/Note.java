

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
 * 终结表达式 音符类
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public class Note extends Expression {

    /** 
     * 构造函数
     */
    public Note() {
        // TODO Auto-generated constructor stub
        
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.解释器模式.Expression#execute(java.lang.String, double) 
     */
    @Override
    public void execute(String playKey, double playValue) {
        // TODO Auto-generated method stub
        String note = "";
        switch (playKey) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(note);
    }

}

