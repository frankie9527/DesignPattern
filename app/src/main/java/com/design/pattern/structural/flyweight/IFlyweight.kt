package com.design.pattern.structural.flyweight


/**
 * @author: Frankie
 * @Date: 2024/7/1
 * @Description:
 */

interface UiWidget {
    fun show();
}

class NewWidget : UiWidget {
    override fun show() {
        println("show New Page")
    }
}

class VideoWidget : UiWidget {
    override fun show() {
        println("show Video Widget ")
    }
}

object MainUiWidgetFactory {
    private val UiMap = HashMap<Int, UiWidget>()
    fun getUiWidget(position: Int): UiWidget {
       var widget =UiMap.get(position)
        if (widget==null){
            if (position==0){
                widget=NewWidget();
            }else if (position ==1){
                widget=VideoWidget();
            }else{
                widget=NewWidget()
            }
        }
        return widget;
    }
}