
package com.yichao.jiang.单例模式;

/**  
 * 单例模式要求1.构造函数私有化；2.提供公共的获取类实例的方法
 * 饿汉模式的缺点：无论该类是否被用到，都会被创建；如果这个创建过程比较耗时，那么就会影响性能
 * @author yichao.jiang 
 * @version  2016年5月16日 
 * @since jdk 1.8 or after
 */
public class EagerMode {
    private EagerMode() {
        
    }
    private static final EagerMode instance = new EagerMode();
    public static EagerMode getInstance() {
        return instance;
    }
}

