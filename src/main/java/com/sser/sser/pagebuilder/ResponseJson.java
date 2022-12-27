package com.sser.sser.pagebuilder;

public class ResponseJson {
    private HtmlFragment[]  elements ;
    public HtmlFragment[] getElements() {
        return elements;
    }

    public void setElements(HtmlFragment[] elements) {
        this.elements = elements;
    }

   public  String toString(){
         String response = "";
         for(HtmlFragment frag:elements){
             String type = frag.getType();
             String nodeOpen = "<"+type+">";
             String nodeClose = "<"+type+"/>";

             response += nodeOpen+frag.getVal()+nodeClose;
         }
         return response;
   }
}
