
package com.yichao.jiang.享元模式;

import java.util.HashMap;

/**  
 * 产生共享对象的工厂
 * @author yichao.jiang 
 * @version  2016年5月25日 
 * @since jdk 1.8 or after
 */
public class WebSiteFactory {
    private HashMap<String, WebSite> flyWeights = new HashMap<String, WebSite>();
    
    public WebSite getWebSite(String key) {
        if (!flyWeights.containsKey(key)) {
            // 如果不存在，则新增一个
            flyWeights.put(key, new ConcreteWebSite(key));
        }
        return flyWeights.get(key);
    }
    
    public int getWebSiteCount() {
        return flyWeights.size();
    }
}

