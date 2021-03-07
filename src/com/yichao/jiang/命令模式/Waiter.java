
package com.yichao.jiang.命令模式;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**  
 * 相当于invoker，解耦客户和厨师
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Waiter {

    /**
     * 服务员所持有的命令
     */
    private List<Command> commands = new ArrayList<Command>();
    
    /**
     * 点菜
     * addCommand
     */
    @SuppressWarnings("deprecation")
    public void addCommand(Command command) {
        // 在这里可以决定是否要对请求拒绝处理
        commands.add(command);
        System.out.println("添加菜单：" + command.toString() + ", time: " + new Date().toLocaleString());
    }
    
    /**
     * 取消点菜
     * removeCommand
     * @param command
     */
    @SuppressWarnings("deprecation")
    public void removeCommand(Command command) {
        commands.remove(command);
        System.out.println("移除点菜：" + command.toString() + ", time: " + new Date().toLocaleString());
    }
    
    /**
     * 通知厨师
     * notifyBarbecuer
     */
    public void notifyBarbecuer() {
        for (Command command : commands) {
            // 执行命令
            command.executeCommand();
        }
    }
}

