package com.flyingh.mybatis.controller;

import com.flyingh.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request) {
        request.setAttribute("persons", personService.findAll());
        return "list";
    }
}
