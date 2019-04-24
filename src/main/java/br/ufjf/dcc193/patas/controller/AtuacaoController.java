package br.ufjf.dcc193.patas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.patas.model.Atuacao;
import br.ufjf.dcc193.patas.model.Sede;
import br.ufjf.dcc193.patas.repository.AtuacaoRepository;
import br.ufjf.dcc193.patas.repository.SedeRepository;

/**
 * AtuacaoController
 */
@Controller
public class AtuacaoController {
    @Autowired
    AtuacaoRepository atuacoes;
    @Autowired
    SedeRepository sedes;

    @RequestMapping("atuacao.html")
    public String atuacao(Model model) {
        model.addAttribute("atuacao", atuacoes.findAll());
        return "atuacao";
    }

    @RequestMapping("form_atuacao.html")
    public String form_atuacao(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "form_atuacao";
    }

    @RequestMapping("cadastrar_atuacao.html")
    public RedirectView cadastrar_atuacao(Atuacao atuacao) {
        atuacoes.save(atuacao);
        addAtuacaoSede(atuacao);
        return new RedirectView("atuacao.html");
    }

    @RequestMapping("edt_atuacao.html")
    public ModelAndView carrega_edt_sede(Atuacao atuacao) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("atuacao", atuacoes.getOne(atuacao.getId()));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("edt_atuacao");
        return mv;
    }

    @RequestMapping("atuacaoe_alterar.html")
    public RedirectView alterar(Atuacao atuacao) {
        atuacoes.save(atuacao);
        return new RedirectView("atuacao.html");
    }

    public void addAtuacaoSede(Atuacao atuacao) {
        Sede sede = atuacao.getSede();
        sede.getAtuacoes().add(atuacao);
        sedes.save(sede);
    }
}