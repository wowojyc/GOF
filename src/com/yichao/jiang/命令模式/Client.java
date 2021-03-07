
package com.yichao.jiang.命令模式;

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
        // 一个餐馆必须有厨师
        Barbecuer receiver = new Barbecuer();
        // 必须有服务员
        Waiter waiter = new Waiter();
        
        Command bakeMutton = new BakeMuttonCommand();
        // 设置厨师
        bakeMutton.setReceiver(receiver);
        
        Command bakeChickWing = new BakeChickWingCommand();
        // 设置厨师
        bakeChickWing.setReceiver(receiver);
        
        // 点菜
        waiter.addCommand(bakeMutton);
        waiter.addCommand(bakeChickWing);
        
        // 通知厨师做菜
        waiter.notifyBarbecuer();
        
        
    }

}

