
package com.yichao.jiang.中介者模式;

/**  
 * 安理会，具体中介者对象
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class UnitedNationsSecurity extends UnitedNations {

    /**
     * 中介者需要持有所有的Colleague对象
     */
    private Usa usa;
    private Iraq iraq;
    
    /** 
     * 获取 usa 
     * @return the usa 
     */
    public Usa getUsa() {
    
        return usa;
    }

    /** 
     * 设置 usa 
     * @param usa the usa to set 
     */
    public void setUsa(Usa usa) {
    
        this.usa = usa;
    }

    /** 
     * 获取 iraq 
     * @return the iraq 
     */
    public Iraq getIraq() {
    
        return iraq;
    }

    /** 
     * 设置 iraq 
     * @param iraq the iraq to set 
     */
    public void setIraq(Iraq iraq) {
    
        this.iraq = iraq;
    }

    /** 
     * 构造函数
     */
    public UnitedNationsSecurity() {
    }

    /*
     * (non-Javadoc) 
     * @see com.yichao.jiang.中介者模式.UnitedNations#declare(java.lang.String, com.yichao.jiang.中介者模式.Country) 
     */
    @Override
    public void declare(String message, Country country) {
        // 在这里面会有大量的逻辑处理，Colleague之间的交互
        if (country == this.usa) {
            this.iraq.getMessage(message);
        }
        if (country == this.iraq) {
            this.usa.getMessage(message);
        }
    }

}

