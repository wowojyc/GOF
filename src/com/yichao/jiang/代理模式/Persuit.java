
package com.yichao.jiang.代理模式;

/**  
 * 被代理对象，真正的方法执行由此方法执行
 * @author yichao.jiang 
 * @version  2016年5月10日 
 * @since jdk 1.8 or after
 */
public class Persuit implements IGiveGift {

    private String girlName;
    
    public Persuit(String girlName) {
        this.girlName = girlName;
    }
    
    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.代理模式.IGiveGift#giveDolls() 
     */
    @Override
    public void giveDolls() {
        System.out.println(girlName + ", 这是给你的洋娃娃.");
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.代理模式.IGiveGift#giveFllowers() 
     */
    @Override
    public void giveFllowers() {
        System.out.println(girlName + ", 这是给你的鲜花.");
    }

}

