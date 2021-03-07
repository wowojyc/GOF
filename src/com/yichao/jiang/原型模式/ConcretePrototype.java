
package com.yichao.jiang.原型模式;

/**  
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class ConcretePrototype extends Prototype {

    /** 
     * 构造函数
     */
    public ConcretePrototype(String id) {
        super(id);
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.原型模式.Prototype#clonePrototype() 
     */
    @Override
    public Prototype clonePrototype() {
        // TODO Auto-generated method stub
        return new ConcretePrototype(this.getId());
    }
}

