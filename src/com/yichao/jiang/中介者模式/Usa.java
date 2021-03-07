
package com.yichao.jiang.中介者模式;

/**  
 * 具体同事类
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Usa extends Country {

    /** 
     * 构造函数
     */
    public Usa(UnitedNations mediator) {
        // TODO Auto-generated constructor stub
        super(mediator);
    }

    /**
     * 
     * declareMessage
     * @param message
     */
    @Override
    public void declareMessage(String message) {
        mediator.declare(message, this);
    }
    /**
     * 
     * getMessage
     * @param message
     */
    @Override
    public void getMessage(String message) {
        System.out.println("美国收到信息：" + message);
    }
}

