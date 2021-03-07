

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

package com.yichao.jiang.抽象工厂模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 如果要更换数据库，只需要修改工厂为OracleFactory
        // 但是如果要新增一个project表，则需要新建一个project接口，并提供Oracle和SqlServer的两种实现
        // 同时需要修改工厂接口以及具体的实现
        AbstractFactory factory = new SqlServerFactory();
        User user = factory.createUser();
        Department department = factory.createDepartment();
        
        user.insert("client");
        department.insert("client-department");
    }

}

