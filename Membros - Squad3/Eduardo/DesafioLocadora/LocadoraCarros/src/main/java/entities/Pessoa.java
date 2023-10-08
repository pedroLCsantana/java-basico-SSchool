package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import entities.enums.Sexo;

@MappedSuperclass
public class Pessoa implements Serializable {
	
	@Column
	private String nome;
	
	@Column
	private String dataNascimento;
	
	@Column
	private String cpf;
	
	private Sexo sexo;
	
	public Pessoa(){
		}

	public Pessoa(String nome, String dataNascimento, String cpf, Sexo sexo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
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
	
}
