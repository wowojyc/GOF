package com.yichao.jiang.中介者模式;

/**  
 * 模拟客户端调用
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class Client {

    /** 
     * main
     * @param args
     */
    public static void main(String[] args) {
        // 1.各个同事之间并不认识
        // 2.各个同事必须都认识中介者对象
        // 3.中介者也必须认识各个同事对象
        
        UnitedNationsSecurity unitedNations = new UnitedNationsSecurity();
        
        Usa usa = new Usa(unitedNations);
        Iraq iraq = new Iraq(unitedNations);
        
        unitedNations.setIraq(iraq);
        unitedNations.setUsa(usa);
        
        // 通过中介者发送信息
        usa.declareMessage("不准研制核武器，否则要发动战争");
        iraq.declareMessage("我们没有核武器，更不怕侵略");
    }

}

