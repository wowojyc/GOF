
package com.yichao.jiang.享元模式;

/**  
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class ConcreteWebSite extends WebSite {

    private String name;
    
    public ConcreteWebSite(String name) {
        this.name = name;
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.享元模式.WebSite#user(com.yichao.jiang.享元模式.User) 
     */
    @Override
    public void user(User user) {
        // TODO Auto-generated method stub
        System.out.println("网站分类：" + name + "，用户:" + user.getName());
    }

}

