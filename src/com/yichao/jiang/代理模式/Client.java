
package com.yichao.jiang.代理模式;

/**  
 * 模拟客户端操作
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // 客户端只知道代理对象的存在，并不知道被代理对象
        Proxy proxy = new Proxy("client");
        proxy.giveDolls();
        proxy.giveFllowers();
    }

}

