

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

package com.yichao.jiang.组合模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Company root = new ChildCompany("总公司");
        root.addCompany(new HRDepartment("总公司HR部门"));
        root.addCompany(new DevelopmentDepartment("总公司开发部门"));
        
        Company child = new ChildCompany("上海分公司");
        child.addCompany(new HRDepartment("上海分公司HR"));
        child.addCompany(new DevelopmentDepartment("上海分公司开发部门"));
        root.addCompany(child);
        
        // 展示
        System.out.println("结构图");
        root.display(1);
        
        System.out.println("职责列表");
        root.LineOfDuty();
    }

}

