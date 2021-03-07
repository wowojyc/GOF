
package com.yichao.jiang.享元模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebSiteFactory factory = new WebSiteFactory();
        
        WebSite fx = factory.getWebSite("产品展示");
        fx.user(new User("小菜"));
        
        WebSite fy = factory.getWebSite("产品展示");
        fy.user(new User("大鸟"));
        
        WebSite fm = factory.getWebSite("博客");
        fm.user(new User("桃谷六仙"));
        
        System.out.println("共享对象数目:" + factory.getWebSiteCount());
    }

}

