

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
 * 使用简单工厂模式创建对象 
 * 可以通过反射或者配置文件等方式获取对应的数据库类型
 * 而无需修改代码
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class DataBaseAccess {

    private static final String db = "";
    
    /**
     * 
     * createUser
     * @return
     */
    public static User createUser() {
        switch (db) {
            case "SqlServer":
                return new UserSqlServer();
            case "Oracle":
                return new UserOracle();
            default:
            throw new UnsupportedOperationException("赞不支持");
        }
    }
    
    /**
     * 
     * createDepartment
     * @return
     */
    public static Department createDepartment() {
        switch (db) {
            case "SqlServer":
                return new DepartmentSqlServer();
            case "Oracle":
                return new DepartmentOracle();
            default:
            throw new UnsupportedOperationException("赞不支持");
        }
    }
}

