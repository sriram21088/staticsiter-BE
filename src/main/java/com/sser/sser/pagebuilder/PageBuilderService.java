package com.sser.sser.pagebuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class PageBuilderService {


    public  String GetPage(String pagejson)  {
        ObjectMapper  objMap = new ObjectMapper();
        try {
            PageJsonFormat format = objMap.readValue(pagejson, PageJsonFormat.class);
            System.out.println(format);

        } catch (JsonProcessingException e) {
            pagejson =  "Error!!!";
        }
        return pagejson;

    }
}
