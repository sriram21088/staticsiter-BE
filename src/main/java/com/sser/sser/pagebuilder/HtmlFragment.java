package com.sser.sser.pagebuilder;

import java.util.ArrayList;

public class HtmlFragment {
    private String type;
    private String val;
    private String style;
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

    public String getHTMLString() {
        String nodeOpen = "<" + type + " style=" + style + ">";
        String nodeClose = "</" + type + ">";
        return nodeOpen + val + nodeClose;

    }


}
