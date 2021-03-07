
package com.yichao.jiang.代理模式;

/**  
 * 代理对象，和被代理对象实现同样的接口
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class Proxy implements IGiveGift {

    /**
     * 持有一个被代理对象的引用
     */
    private Persuit persuit;
    
    public Proxy(String girlName) {
        persuit = new Persuit(girlName);
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.代理模式.IGiveGift#giveDolls() 
     */
    @Override
    public void giveDolls() {
        // 调用被代理对象的方法
        persuit.giveDolls();
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.代理模式.IGiveGift#giveFllowers() 
     */
    @Override
    public void giveFllowers() {
        // 调用被代理对象的方法
        persuit.giveFllowers();
    }

}

