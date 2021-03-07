
package com.yichao.jiang.命令模式;

/**  
 * 抽象命令类
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public abstract class Command {

    /**
     * 持有一个receiver，也就是点的菜必须交给厨师去处理
     */
    protected Barbecuer receiver;

    /** 
     * 获取 receiver 
     * @return the receiver 
     */
    public Barbecuer getReceiver() {
    
        return receiver;
    }

    /** 
     * 设置 receiver 
     * @param receiver the receiver to set 
     */
    public void setReceiver(Barbecuer receiver) {
    
        this.receiver = receiver;
    }
    
    /**
     * 执行命令
     * executeCommand
     */
    public abstract void executeCommand();
}

