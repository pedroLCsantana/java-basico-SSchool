package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import entities.enums.Sexo;

@Entity

@Table(name = "motorista")
public class Motorista extends Pessoa {
	
	@Id
	@Column
	private String numeroCNH;
	
	public Motorista() {
		super();
	}
	
	public Motorista(String nome, String dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
		super(nome, dataNascimento, cpf, sexo);
		this.numeroCNH = numeroCNH;
	}

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	
}
