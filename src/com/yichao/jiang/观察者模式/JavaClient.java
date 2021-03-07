

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

package com.yichao.jiang.观察者模式;

/**  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class JavaClient {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JavaObserverable subject = new JavaObserverable();
        
        JavaObserver observer = new JavaObserver();
        
        
        subject.addObserver(observer);
        subject.setMessage("老板来了");
        subject.setMessage("领导来了");
        subject.setMessage("快下班吧");
    }

}

