package com.sser.sser.pagebuilder;

import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class HtmlFragment {
    private String type;
    private String val;
    private String style;

    public HtmlFragmentAttribute[] getAttr() {
        return attr;
    }

    private HtmlFragmentAttribute[] attr;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }


    public void setAttr(HtmlFragmentAttribute[] atr){
         attr= atr;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getHTMLString(){
        Element element = new Element(type);
        if(val !=null){
            element.text(val);
        }
        if(style !=null){
            element.attr("style",style);
        }

        if(attr != null){
            for(HtmlFragmentAttribute attr : attr){
                element.attr(attr.getName(), attr.getVal());
            }
        }

        return element.toString();
    }


}
