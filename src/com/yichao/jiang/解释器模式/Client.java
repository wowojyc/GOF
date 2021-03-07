

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
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 全局上下文
        PlayContext context = new PlayContext();
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 ");
        // 新增表达式可以直接继承自Expression，扩展容易
        // 本例子仅涉及到终结表达式，对于非终结表达式还需递归调用
        Expression expression = null;
        while(context.getPlayText().length() > 0) {
            String str = context.getPlayText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                    expression = new Note();
                    break;
            }
            expression.interpret(context);
        }
                
    }

}

