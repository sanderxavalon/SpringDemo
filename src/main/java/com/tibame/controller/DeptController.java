package com.tibame.controller;

import com.tibame.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/getAllDept")
    public String getAll(Model model) {
        model.addAttribute("depts", deptService.getAll());
        return "AllDept";
    }

}
