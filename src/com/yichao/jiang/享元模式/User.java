
package com.yichao.jiang.享元模式;

/**  
 * 用户类，用于网站的客户账户，是"网站"类的外部状态
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class User {

    private String name;
    
    public User(String name) {
        this.name = name;
    }

    /** 
     * 获取 name 
     * @return the name 
     */
    public String getName() {
    
        return name;
    }

    /** 
     * 设置 name 
     * @param name the name to set 
     */
    public void setName(String name) {
    
        this.name = name;
    }
}

