package br.ufjf.dcc193.patas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping("index.html")
    String index() {

        return "index.jsp";

    }
    
}