package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public abstract class Staff {

    protected Staff superior;
    /**
     * 设置上级
     * */
    public void setSuperior(Staff superior){
        this.superior=superior;
    }
    abstract void dealEvent(int money);
}
