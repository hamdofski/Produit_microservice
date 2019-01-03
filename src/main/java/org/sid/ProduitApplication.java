package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		produitRepository.findAll().forEach(p->{
			System.out.println(p.getNomProduit());
		});
	}
}
