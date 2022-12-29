package com.sser.sser.pagebuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PageBuilderService {
    public ArrayList<HtmlFragment[]> GetPage(String pagejson) {
        ObjectMapper objMap = new ObjectMapper();
        ArrayList<JsonNode[]> formattedArray = new ArrayList<JsonNode[]>();
        ResponseJson nodeList = null;
        try {
            nodeList = objMap.readValue(pagejson,ResponseJson.class);
            nodeList.alterNodes();
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        return nodeList.getreOrganizer();
        //return (ArrayNode) nodeList;

    }
}
