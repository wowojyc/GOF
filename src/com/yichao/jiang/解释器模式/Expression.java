

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
 * 表达式基类，定义解释方法，需要由子类具体实现 
 * 
 * 对于文法中的非终结符或者终结符都必须有对应的表达式
 * @author yichao.jiang 
 * @version  2016年5月26日 
 * @since jdk 1.8 or after
 */
public abstract class Expression {

    /**
     * 表达式的解释操作，对全局上下文进行处理
     * interpret
     * @param context
     */
    public void interpret(PlayContext context) {
        // 该方法定义了解释的模板，具体的执行方法会调用execute方法实现
        if (context.getPlayText().length() == 0) {
            return;
        } else {
            String playKey = context.getPlayText().substring(0, 1);
            context.setPlayText(context.getPlayText().substring(2));
            double playValue = Double.valueOf(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));
            context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));
            execute(playKey, playValue);
        }
        
    }
    
    /**
     * 执行方法，需要由子类具体实现
     * execute
     * @param context
     */
    public abstract void execute(String playKey, double playValue);
}

