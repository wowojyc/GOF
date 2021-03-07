
package com.yichao.jiang.命令模式;

/**  
 * 担任receiver角色，是命令的真正执行者
 * 相当于厨师角色
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Barbecuer {
    
    /**
     * 真正的执行方法
     * bakeMutton
     */
    public void bakeMutton() {
        System.out.println("厨师烤羊肉串");
    }
    
    /**
     * 真正的执行方法
     * bakeChickenWing
     */
    public void bakeChickenWing() {
        System.out.println("厨师烤鸡翅");
    }
}

