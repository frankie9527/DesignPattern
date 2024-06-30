package com.design.pattern.creation.prototype;

/**
 * author: Frankie
 * Date: 2024/7/1
 * Description:
 * 快速生成与原型对象相同的实例
 */
public class PrototypePattern {
    public static void main(String[] args){
        WordDocument originDoc = new WordDocument();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();

        doc2.setText("这是修改过的Doc2文本");
        doc2.addImage("哈哈.jpg");
        doc2.showDocument();

        originDoc.showDocument();
    }
}
