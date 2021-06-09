package com.mytests.springmvc.xml.viewresolvers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

// the view name is not resolved here
@Controller
public class MyController {
    @RequestMapping("/page1")
    public String thymeleafpage1(ModelMap model) {
        model.addAttribute("page1_attr1", "page1_attr1");
        return "page1";
    }
}
