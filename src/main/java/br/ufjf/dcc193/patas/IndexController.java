package br.ufjf.dcc193.patas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping({"","index.html"})
    public String index() {

        return "index";
    }

    @RequestMapping({"formSede.html"})
    public String formularioSede() {

        return "formSede";
    }

    @RequestMapping({"resultSede.html"})
    public ModelAndView resultadoSede(Sede sede) {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("resultSede");
        mv.addObject("sede", sede);

        return mv;
    }

    
    @RequestMapping({"sedes.html"})
    public ModelAndView sedes() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("sede-list");

//        List<Sede> sedes = sedes().findAll;

//        List<Sede> sedes = sedes().findAll;
//        mv.addObject("sedes", sedes);
        
        return mv;
    }
    
}