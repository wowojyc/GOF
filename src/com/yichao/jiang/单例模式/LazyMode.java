
package com.yichao.jiang.单例模式;

/**  
 * 懒汉模式在该对象真正被调用时才会创建
 * @author yichao.jiang 
 * @version  2016年5月16日 
 * @since jdk 1.8 or after
 */
public class LazyMode {
    private LazyMode() {
        
    }
    // 默认初始化为null
    private static LazyMode instance = null;
    public static LazyMode getInstance() {
        if (instance == null) {
            // instance为null，说明还未创建
            instance = new LazyMode();
        }
        return instance;
    }
}

