
package com.yichao.jiang.备忘录模式;

/**  
 * Originator备忘录发起者
 * @author yichao.jiang 
 * @version  2016年5月12日 
 * @since jdk 1.8 or after
 */
public class PlayRole {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防守能力
    
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }
    
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }
    
    public void displayState() {
        System.out.println("生命力:" + vit + ", 攻击力:" + atk + ", 防守力:" + def);
    }
    
    /**
     * 保存备忘录
     * saveState
     * @return
     */
    public RoleMemento saveState() {
        return new RoleMemento(vit, atk, def);
    }
    
    /**
     * 从备忘录中恢复状态
     * recoveryState
     * @param memento
     */
    public void recoveryState(RoleMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}

