package com.design.pattern.factory.abstracted;

/**
 * 内饰
 */
public interface IInterior {
    void describe();

    /**
     * 坐垫参数
     */
    void seatParameter();

    /**
     * 是否带有天窗
     */
    boolean haveSunroof();
}
