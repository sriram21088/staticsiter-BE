package com.sser.sser.pagebuilder;

import java.util.ArrayList;

public class ResponseJson {
    private int count = 0;
    private HtmlFragment[] rowSplitter = new HtmlFragment[3];

    private void createNewRowSplitter() {
        rowSplitter = new HtmlFragment[3];
    }

    private HtmlFragment[] getCurrentRowSplitter() {
        return rowSplitter;
    }

    public ArrayList<HtmlFragment[]> getreOrganizer() {
        return reOrganizer;
    }

    private ArrayList<HtmlFragment[]> reOrganizer = new ArrayList<>();
    private HtmlFragment[] elements;

    public HtmlFragment[] getElements() {
        return elements;
    }

    public void setElements(HtmlFragment[] elements) {
        this.elements = elements;
    }

    public String toString() {
        StringBuilder response = new StringBuilder();
        for (HtmlFragment frag : elements) {
            String type = frag.getType();
            String nodeOpen = "<" + type + " style=\"" + frag.getStyle() + "\">";
            String nodeClose = "<" + type + "/>";

            response.append(nodeOpen).append(frag.getVal()).append(nodeClose);
        }
        return response.toString();
    }

    public void alterNodes() {
        for (int i = 0; i < elements.length; i++) {
            HtmlFragment[] rs = getCurrentRowSplitter();
            if (count == 2 || i == elements.length - 1) {
                rs[count] = elements[i];
                reOrganizer.add(rs.clone());
                if (count == 2) {
                    createNewRowSplitter();
                    count = 0;
                }
            } else {
                rs[count] = elements[i];
                count++;
            }


        }

    }
}
