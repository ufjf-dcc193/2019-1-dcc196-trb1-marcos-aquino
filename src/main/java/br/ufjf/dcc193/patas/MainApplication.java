package br.ufjf.dcc193.patas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.patas.model.Atuacao;
import br.ufjf.dcc193.patas.model.Voluntario;
import br.ufjf.dcc193.patas.model.Sede;
import br.ufjf.dcc193.patas.repository.AtuacaoRepository;
import br.ufjf.dcc193.patas.repository.VoluntarioRepository;
import br.ufjf.dcc193.patas.repository.SedeRepository;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		VoluntarioRepository repVoluntario = ctx.getBean(VoluntarioRepository.class);
		AtuacaoRepository repAtuacao = ctx.getBean(AtuacaoRepository.class);

		Sede s1 = new Sede("Felinos", "MG", "Juiz de Fora", "Benfica", 32222977, "www.felinos.org");
		Sede s2 = new Sede("Peludos", "MG", "Bicas", "Jardim", 32753358, "www.peludos.org");
		Sede s3 = new Sede("Amparo", "MG", "Lima Duarte", "Vila", 981547785, "www.amparo.org");
		Sede s4 = new Sede("Filhotes", "MG", "Juiz de Fora", "Centro", 32153342, "www.filhotes.org");
		Sede s5 = new Sede("Patinhas", "MG", "Juiz de Fora", "Paineiras", 33510060, "www.patinhas.org");
		repSede.save(s1);
		repSede.save(s2);
		repSede.save(s3);
		repSede.save(s4);
		repSede.save(s5);

		Voluntario m1 = new Voluntario(s1, "Hugo", "Voluntario", "hugo@ig.com", "25/03/2017", "05/08/2018");
		Voluntario m2 = new Voluntario(s1, "Raissa", "Voluntario", "raissa@gmail.com", "03/09/2017", "08/12/2018");
		Voluntario m3 = new Voluntario(s2, "Nubia", "Voluntario", "nubia@hotmail.com", "15/02/2019", "17/10/2018");
		Voluntario m4 = new Voluntario(s2, "Taina", "Voluntario", "taina@uol.com", "22/09/2018", "20/10/2019");
		Voluntario m5 = new Voluntario(s2, "Ana", "Voluntario", "ana@hotmail.com", "15/02/2018", "25/11/2018");
		Voluntario m6 = new Voluntario(s2, "Daniela", "Voluntario", "dani@hotmail.com", "15/12/2018", "27/01/2018");
		Voluntario m7 = new Voluntario(s2, "Rafael", "Voluntario", "rafa@hotmail.com", "20/02/2017", "25/03/2018");
		repVoluntario.save(m1);
		repVoluntario.save(m2);
		repVoluntario.save(m3);
		repVoluntario.save(m4);
		repVoluntario.save(m5);
		repVoluntario.save(m6);
		repVoluntario.save(m7);

		Atuacao a1 = new Atuacao(s1, "Canil", "Canil para cães abandonados", "xx/xx/20xx", "01/06/2017", 10, 15, 20, 25);
		Atuacao a2 = new Atuacao(s1, "Castração", "Castração de animais", "xx/xx/20xx", "01/06/2017", 10, 12, 40, 50);
		Atuacao a3 = new Atuacao(s2, "Morada", "Alojamento de animais", "xx/xx/20xx", "01/06/2017", 55, 22, 35, 80);
		Atuacao a4 = new Atuacao(s3, "Gatil", "Casa de gatos", "xx/xx/20xx", "xx/xx/20xx", 10, 20, 30, 40);
		repAtuacao.save(a1);
		repAtuacao.save(a2);
		repAtuacao.save(a3);
		repAtuacao.save(a4);

		List<Atuacao> as1 = new ArrayList<>();
		as1.add(a1);
		as1.add(a2);
		s1.setAtuacoes(as1);
		repSede.save(s1);

		List<Atuacao> as2 = new ArrayList<>();
		as2.add(a3);
		s2.setAtuacoes(as2);
		repSede.save(s2);

		List<Atuacao> as3 = new ArrayList<>();
		as3.add(a4);
		s3.setAtuacoes(as3);
		repSede.save(s3);
	}

}
