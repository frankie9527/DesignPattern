package com.design.pattern.behavioral.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * author: Frankie
 * Date: 2024/6/27
 * Description:tv 遥控板
 */
public class TvPanel {
   private Map<Integer, Command> map = new HashMap<>();

    public void setCommand(int key, Command cmd) {
        map.put(key, cmd);
    }
    public void onKeyPressed(int key){
        Objects.requireNonNull(map.get(key)).execute();
    }

}
