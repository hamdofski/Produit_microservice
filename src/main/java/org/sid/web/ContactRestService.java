package org.sid.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;

@RestController
@CrossOrigin("*")
public class ContactRestService {
	@Autowired
	private ProduitRepository produitRepository;
	@RequestMapping(value="/produits",method=RequestMethod.GET)
	public List<Produit> getProduits(){
		return produitRepository.findAll();
		

}
	@RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
	public Produit getProduit(@PathVariable Long id){
		return produitRepository.findOne(id);
		
}
	@RequestMapping(value="/produits",method=RequestMethod.POST)
	public Produit save(@RequestBody Produit  p){
		return produitRepository.save(p);
		
}
		

	@RequestMapping(value="/produits/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		produitRepository.delete(id);
		return true;
		
}
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT)
	public Produit save(@PathVariable Long id,@RequestBody Produit  p){
		p.setIdProduct(id);
		return produitRepository.save(p);
		
}
	
	}
