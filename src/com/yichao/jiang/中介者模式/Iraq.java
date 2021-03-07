
package com.yichao.jiang.中介者模式;

/**  
 * 具体同事类
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Iraq extends Country {

    /** 
     * 构造函数
     */
    public Iraq(UnitedNations mediator) {
        // TODO Auto-generated constructor stub
        super(mediator);

    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.中介者模式.Country#declareMessage(java.lang.String) 
     */
    @Override
    public void declareMessage(String message) {
        // TODO Auto-generated method stub
        mediator.declare(message, this);
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.中介者模式.Country#getMessage(java.lang.String) 
     */
    @Override
    public void getMessage(String message) {
        // TODO Auto-generated method stub
        System.out.println("伊拉克收到信息:" + message);
    }

}

