
package com.yichao.jiang.备忘录模式;

/**  
 * 模拟客户端调用
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RoleCareTaker careTaker = new RoleCareTaker();
        
        PlayRole lixiaoyao = new PlayRole();
        lixiaoyao.initState();
        // 保存进度
        careTaker.setMemento(lixiaoyao.saveState());
        lixiaoyao.displayState();
        
        lixiaoyao.fight();
        lixiaoyao.displayState();
        
        lixiaoyao.recoveryState(careTaker.getMemento());
        lixiaoyao.displayState();
    }

}

