
package com.yichao.jiang.命令模式;

/**  
 * 具体命令类
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class BakeMuttonCommand extends Command {

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.命令模式.Command#executeCommand() 
     */
    @Override
    public void executeCommand() {
        // TODO Auto-generated method stub
        // 调用receiver的方法
        receiver.bakeMutton();
    }   

    @Override
    public String toString() {
        return "烤羊肉串";
    }
}

