package com.sser.sser.pagebuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PageBuilderService {


    public  String GetPage(String pagejson)  {
        ObjectMapper  objMap = new ObjectMapper();
        try {
            ResponseJson nodeList = objMap.readValue(pagejson, ResponseJson.class);
            pagejson = nodeList.toString();
        } catch (JsonProcessingException e) {
            pagejson =  "Error!!!";
        }
        return pagejson;

    }
}
