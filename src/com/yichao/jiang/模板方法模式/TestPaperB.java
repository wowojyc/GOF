

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
 * 继承模本基类，并根据自己情况覆盖细节步骤
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class TestPaperB extends TestPaper {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.模板方法模式.TestPaper#answer1() 
     */
    @Override
    protected String answer1() {
        // TODO Auto-generated method stub
        return "C";

    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.模板方法模式.TestPaper#answer2() 
     */
    @Override
    protected String answer2() {
        // TODO Auto-generated method stub
        return "B";

    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.模板方法模式.TestPaper#answer3() 
     */
    @Override
    protected String answer3() {
        // TODO Auto-generated method stub
        return "A";

    }

}

