package com.design.pattern.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * author: Frankie
 * Date: 2024/7/1
 * Description:
 */
public class WordDocument implements Cloneable{
    /**
     * 文本
     */
    private String mText;
    /**
     * 图片名列表
     */
    private ArrayList<String>  mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("----------- WordDocument构造函数 -----------");
    }

    /**
     * 克隆对象
     */
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
//            doc.mImages = this.mImages;
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
        }

        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public List<String> getImages() {
        return mImages;
    }

    /**
     * @param img
     */
    public void addImage(String img) {
        this.mImages.add(img);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("----------- Word Content Start -----------");
        System.out.println("Text : " + mText);
        System.out.println("Images List: ");
        for (String imgName : mImages) {
            System.out.println("image name : " + imgName);
        }
        System.out.println("----------- Word Content End -----------");
    }
}
