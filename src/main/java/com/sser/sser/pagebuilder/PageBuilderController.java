package com.sser.sser.pagebuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageBuilderController {
 @Autowired
 private  PageBuilderService PageBuilderService;
@RequestMapping(value="/")
 public String getLandingPage(){
 return "Landing";
}

 @RequestMapping(value="/getPage", method = RequestMethod.POST)
 public ModelAndView getPage(@RequestBody String response) {
  ModelAndView mv = new ModelAndView("ResponsivePage");
  mv.addObject("nodes",PageBuilderService.GetPage(response));
  return mv;
 }
}
