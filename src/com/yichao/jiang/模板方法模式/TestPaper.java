

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

package com.yichao.jiang.模板方法模式;

/** 
 * 基类，定义算法的骨架 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public abstract class TestPaper {

    /**
     * 需由子类实现
     * answer1
     * @return
     */
    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();
    
    protected void testQuestion1() {
        System.out.println("第一题答案:" + answer1());
    }
    
    protected void testQuestion2() {
        System.out.println("第二题答案:" + answer2());
    }
    
    protected void testQuestion3() {
        System.out.println("第三题答案:" + answer3());
    }
    
    /**
     * 算法骨架，该步骤固定，但是某一步骤的具体细节会由子类具体实现
     * exam
     */
    public void exam() {
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }
}

