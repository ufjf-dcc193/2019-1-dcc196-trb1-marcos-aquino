package br.ufjf.dcc193.patas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping("sobre.html")
    public String sobre() {
        return "sobre";
    }
    
}