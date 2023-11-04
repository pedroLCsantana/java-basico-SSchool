package entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import entities.enums.Sexo;

@MappedSuperclass
public abstract class Pessoa implements Serializable {
	
	//public static final long serialVersionUID = 1L;

	@Column
	 String nome;
	
	@Column
	LocalDate dataNascimento;
	
	@Column
	protected
	String cpf;
	
	@Column
	String email;
	
	Sexo sexo;
	
	public Pessoa(){
		}

	public Pessoa(String nome, LocalDate dataNascimento, String cpf, String email, Sexo sexo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.sexo = sexo;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
