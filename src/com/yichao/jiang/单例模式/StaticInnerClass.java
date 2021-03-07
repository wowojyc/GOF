
package com.yichao.jiang.单例模式;

/**  
 * 基于静态内部类的单例模式
 * @author yichao.jiang 
 * @version  2016年5月16日 
 * @since jdk 1.8 or after
 */
public class StaticInnerClass {
    
    /**
     * 该类只有在被用到的情况下才会加载
     * @author yichao.jiang 
     * @version  2016年5月16日 
     * @since jdk 1.8 or after
     */
    static class InstanceClass {
        // 静态初始化器可以保证线程安全性
        private static final StaticInnerClass instance = new StaticInnerClass();
    }
    
    private StaticInnerClass() {
        
    }
    
    public static StaticInnerClass getInstance() {
        return InstanceClass.instance;
    }
}

