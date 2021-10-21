package br.com.felippe.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felippe.clinicaapi.model.Clientes;

public interface DadosRepository extends JpaRepository<Clientes, Long>{

}
