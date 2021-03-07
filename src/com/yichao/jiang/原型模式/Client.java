
package com.yichao.jiang.原型模式;

/** 
 * 模拟客户端调用 
 * @author yichao.jiang 
 * @version  2016年5月11日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcretePrototype c1 = new ConcretePrototype("client");
        ConcretePrototype c2 = (ConcretePrototype) c1.clonePrototype();
        
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        
        testPrototypeJava();
    }

    /**
     * 使用基于java内部的Cloneable接口的原型模式
     * testPrototypeJava
     */
    public static void testPrototypeJava() {
        PrototypeJava p1 = new PrototypeJava("client-java");
        PrototypeJava p2 = p1.clone();
        
        System.out.println(p1.getId());
        System.out.println(p2.getId());
    }
}

