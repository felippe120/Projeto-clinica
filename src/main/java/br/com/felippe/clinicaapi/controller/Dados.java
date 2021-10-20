package br.com.felippe.clinicaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felippe.clinicaapi.model.Clientes;


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
	
	@GetMapping
	public String inicial() {
		return "Olá! Você esta na página inicial do projeto";	
	}
	
	@GetMapping("/cliente")
	public String cliente() {
		return "Heloísa Nascimento";
	}
	@GetMapping("/clientes")
	public List<Clientes> clientes() {
		List<Clientes> lst = new ArrayList<Clientes>();
		Clientes c1 = new Clientes();
		Clientes c2 = new Clientes();
		
		c1.setNome("Wagner");
		c2.setNome("Vanessa");
		
		lst.add(c1);
		lst.add(c2);
		
		return lst;
	}
	
	@PostMapping("/cadastro")
	public String cadastro() {
		return "Cadastro realizado";
	}
	
	@PostMapping("/atualizar")
	public String atualizar() {
		return "Dados atualizados";
	}
	
	@DeleteMapping("/apagar")
	public String apagar() {
		return "Dados apagados";
	}
	
}







