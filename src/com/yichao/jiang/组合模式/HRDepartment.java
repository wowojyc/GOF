

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
 * 叶子节点
 * 对于增加或者删除节点，不提供操作；但用户是不会感知的
 * @author yichao.jiang 
 * @version  2016年5月13日 
 * @since jdk 1.8 or after
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        // TODO Auto-generated constructor stub
        super(name);
        
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.组合模式.Company#addCompany(com.yichao.jiang.组合模式.Company) 
     */
    @Override
    public void addCompany(Company company) {
        // TODO Auto-generated method stub
        
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.组合模式.Company#removeCompany(com.yichao.jiang.组合模式.Company) 
     */
    @Override
    public void removeCompany(Company company) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.组合模式.Company#LineOfDuty() 
     */
    @Override
    public void LineOfDuty() {
        // TODO Auto-generated method stub
        System.out.println(name + "HR部门负责人员招聘");
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.组合模式.Company#display(int) 
     */
    @Override
    public void display(int depth) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.print(name);
        System.out.println();
    }

}

