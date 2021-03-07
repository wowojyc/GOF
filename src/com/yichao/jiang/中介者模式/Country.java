
package com.yichao.jiang.中介者模式;

/** 
 * 相当于中介者模式中的Colleague同事类 
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public abstract class Country {

    /**
     * Colleague需要持有中介者，以便通过中介者发送消息，同另一外的Colleague交互
     */
    protected UnitedNations mediator;
    
    /**
     * 构造函数
     */
    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
    
    /**
     * 同事类发送消息
     * declareMessage
     * @param message
     */
    public abstract void declareMessage(String message);
    
    /**
     * 同事类接收消息
     * getMessage
     * @param message
     */
    public abstract void getMessage(String message);
    
}

