package br.ufjf.dcc193.patas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MainApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

		SedeRepository sedeRep = ctx.getBean(SedeRepository.class);

		sedeRep.save(new Sede("felinos", "MG", "Juiz de Fora", 
							  "Benfica", "32224499", "www.felinos.org"));
		
		sedeRep.save(new Sede("recanto", "MG", "Lima Duarte", 
							  "Centro", "32814455", "www.recanto.org"));

		System.out.println(sedeRep.findAll().toString());
		
	}

}
