package com.sser.sser.pagebuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PageBuilderController {
 @Autowired
 private  PageBuilderService PageBuilderService;
 @RequestMapping(value="/getPage", method= RequestMethod.POST)
  public  String getPage(@RequestBody String pagejson) throws JsonProcessingException {
     return PageBuilderService.GetPage(pagejson);
 }
}
