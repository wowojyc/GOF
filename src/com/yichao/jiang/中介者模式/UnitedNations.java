
package com.yichao.jiang.中介者模式;

/** 
 * Mediator中介者 
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public abstract class UnitedNations {

    /**
     * 中介者需要执行的核心方法
     * declare
     * @param message
     * @param country
     */
    public abstract void declare(String message, Country country);
}

