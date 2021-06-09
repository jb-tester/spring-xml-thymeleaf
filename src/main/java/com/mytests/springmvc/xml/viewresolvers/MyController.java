package com.mytests.springmvc.xml.viewresolvers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 09.06.2021.</p>
 * <p>Project: spring-xml-viewresolvers</p>
 * *
 */
@Controller
public class MyController {
    @RequestMapping("/page1")
    public String thymeleafpage1(ModelMap model) {
        model.addAttribute("page1_attr1", "page1_attr1");
        return "page1";
    }
}
