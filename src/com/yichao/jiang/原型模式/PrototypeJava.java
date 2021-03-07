
package com.yichao.jiang.原型模式;

/**  
 * 使用java内部的Cloneable接口实现原型模式
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class PrototypeJava implements Cloneable {

    private String id;
    
    public PrototypeJava (String id) {
        this.id = id;
    }
    
    
    public String getId() {
    
        return id;
    }


    public void setId(String id) {
    
        this.id = id;
    }


    @Override
    public PrototypeJava clone() {
        return new PrototypeJava(id);
    }
}

