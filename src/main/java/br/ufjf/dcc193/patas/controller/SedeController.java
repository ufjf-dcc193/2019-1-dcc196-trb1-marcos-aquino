package br.ufjf.dcc193.patas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.patas.model.Atuacao;
import br.ufjf.dcc193.patas.model.Voluntario;
import br.ufjf.dcc193.patas.model.Sede;
import br.ufjf.dcc193.patas.repository.AtuacaoRepository;
import br.ufjf.dcc193.patas.repository.VoluntarioRepository;
import br.ufjf.dcc193.patas.repository.SedeRepository;

/**
 * SedeController
 */
@Controller
public class SedeController {
    @Autowired
    SedeRepository sedes;
    @Autowired
    AtuacaoRepository atuacoes;
    @Autowired
    VoluntarioRepository voluntarios;

    @RequestMapping("sede.html")
    public String sede(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "sede";
    }

    @RequestMapping("form_sede.html")
    public String form_sede() {
        return "form_sede";
    }

    @RequestMapping("cadastrar_sede.html")
    public RedirectView cadastrar_sede(Sede sede) {
        sedes.save(sede);
        return new RedirectView("sede.html");
    }

    @RequestMapping("edt_sede.html")
    public ModelAndView carrega_edt_sede(Sede sede) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sede", sedes.getOne(sede.getId()));
        mv.setViewName("edt_sede");
        return mv;
    }

    @RequestMapping("sede_excluir.html")
    public ModelAndView excluir_sede(Sede s) {
        ModelAndView mv = new ModelAndView();
        Sede sede = sedes.getOne(s.getId());
        sede.getAtuacoes().clear();
        for (Atuacao atuacao : atuacoes.findAll()) {
            if (atuacao.getSede().getId() == sede.getId()) {
                atuacoes.deleteById(atuacao.getId());
            }
        }
        for (Voluntario voluntario : voluntarios.findAll()) {
            if (voluntario.getSede().getId() == sede.getId()) {
                voluntarios.deleteById(voluntario.getId());
            }
        }
        sedes.deleteById(s.getId());
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("sede");
        return mv;
    }

    @RequestMapping("relatorio.html")
    public ModelAndView relatorio(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("relatorio");
        model.addAttribute("relatorio", sedes.findAll());
        return mv;
    }
}