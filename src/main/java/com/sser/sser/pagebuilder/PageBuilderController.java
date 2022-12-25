package com.sser.sser.pagebuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PageBuilderController {
 @Autowired
 private  PageBuilderService PageBuilderService;
 @RequestMapping(value="/getPage", method= RequestMethod.POST)
  public  String getPage(@RequestBody String pagejson) {
     return PageBuilderService.GetPage(pagejson);
 }
}
