

package com.yichao.jiang.享元模式;

/**  
 * 共享对象
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public abstract class WebSite {
    /**
     * 接收外部状态
     * user
     * @param user
     */
    public abstract void user(User user);
}

