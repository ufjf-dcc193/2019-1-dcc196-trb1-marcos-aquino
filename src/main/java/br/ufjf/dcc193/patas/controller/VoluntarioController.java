package br.ufjf.dcc193.patas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.patas.model.Voluntario;
import br.ufjf.dcc193.patas.repository.VoluntarioRepository;
import br.ufjf.dcc193.patas.repository.SedeRepository;

/**
 * VoluntarioController
 */
@Controller
public class VoluntarioController {
    @Autowired
    VoluntarioRepository voluntarios;
    @Autowired
    SedeRepository sedes;

    @RequestMapping("voluntario.html")
    public String voluntario(Model model) {
        model.addAttribute("voluntario", voluntarios.findAll());
        return "voluntario";
    }

    @RequestMapping("form_voluntario.html")
    public String form_voluntario(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "form_voluntario";
    }

    @RequestMapping("cadastrar_voluntario.html")
    public RedirectView cadastrar_voluntario(Voluntario voluntario) {
        voluntarios.save(voluntario);
        return new RedirectView("voluntario.html");
    }

    @RequestMapping("edt_voluntario.html")
    public ModelAndView carrega_edt_voluntario(Voluntario voluntario) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("voluntario", voluntarios.getOne(voluntario.getId()));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("edt_voluntario");
        return mv;
    }
}