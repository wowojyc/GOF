
package com.yichao.jiang.单例模式;

/**  
 * 懒汉模式是线程不安全的，比如两个线程同时调用getInstance，判断都为null
 * 那么两个线程都会进行创建
 * @author yichao.jiang 
 * @version  2016年5月16日 
 * @since jdk 1.8 or after
 */
public class SynchronizedSingletonClass {
    private SynchronizedSingletonClass() {
        
    }
    private static SynchronizedSingletonClass instance = null;
    
    public static SynchronizedSingletonClass getInstance() {
        if (instance == null) {
            // static方法中没有this
            synchronized(SynchronizedSingletonClass.class) {
                // 之所以在这个地方需要重新判断，是因为有可能在某个线程等待锁的过程中
                // 另一个先获取锁的线程已经创建完成
                if (instance == null) {
                    instance = new SynchronizedSingletonClass();
                }
            }
        }
        return instance;
    }
}

