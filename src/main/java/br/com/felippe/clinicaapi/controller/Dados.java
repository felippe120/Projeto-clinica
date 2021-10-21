package br.com.felippe.clinicaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felippe.clinicaapi.model.Clientes;
import br.com.felippe.clinicaapi.repository.DadosRepository;


/*
* Em nosso projeto iremos utilizar algumas anotações(Annotations) que são
* elementos de tipificação de códigos, ou seja, são aaplicações que fazemos no código para
* informar o que aquela linha ou grupo de comando
* deve fazer e como deve ser entendido.
* No caso abaixo, estamos dizendo que nossa classe Dados é um controlador
* de fluxo que reberá comandos em Rest e Responderá dados no formato
* Rest. 
*/

@RestController
@RequestMapping("/")
public class Dados {
	
	@Autowired
	private DadosRepository dr;
	
	@PostMapping("/cad")
	public String cadastro(@RequestBody Clientes clientes) {
		dr.save(clientes);
		return "Cliente cadastrado com sucesso";
	}
	
	@GetMapping("/clientes")
	public List<Clientes> cliente(){
		return dr.findAll();
	}
	
}







