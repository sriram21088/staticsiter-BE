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
         StringBuilder response = new StringBuilder();
         for(HtmlFragment frag:elements){
             String type = frag.getType();
             String nodeOpen = "<"+type+" style="+frag.getAttrs()+">";
             String nodeClose = "<"+type+"/>";

             response.append(nodeOpen).append(frag.getVal()).append(nodeClose);
         }
         return response.toString();
   }
}
