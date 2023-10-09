package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import entities.enums.Sexo;

import java.time.LocalDate;

// testando os codigo com git

@Entity

@Table(name = "motorista")
public class Motorista extends Pessoa {
	
	@Id
	@Column
	private String numeroCNH;
	
	public Motorista() {
		super();
	}
	
	public Motorista(String nome, LocalDate dataNascimento, String cpf, String email, Sexo sexo, String numeroCNH) {
		super(nome, dataNascimento, cpf, email, sexo);
		this.numeroCNH = numeroCNH;
	}

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	
}
