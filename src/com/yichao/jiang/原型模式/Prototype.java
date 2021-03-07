
package com.yichao.jiang.原型模式;

/** 
 * 原型接口类，必须提供克隆自身的方法 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public abstract class Prototype {
    
    private String id;

    public Prototype(String id) {
        // TODO Auto-generated constructor stub
        this.id = id;
    }

    public String getId() {
    
        return id;
    }

    public void setId(String id) {
    
        this.id = id;
    }
    
    /**
     * 提供克隆自身的方法
     * clonePrototype
     * @return
     */
    public abstract Prototype clonePrototype();
}

