package com.sser.sser.pagebuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PageBuilderService {


    public ArrayNode GetPage(String pagejson) {
        ObjectMapper objMap = new ObjectMapper();
        JsonNode nodeList = null;
        try {
            nodeList = objMap.readTree(pagejson);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
        return (ArrayNode) nodeList.get("elements");

    }
}
