package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Motorista;
import entities.enums.Sexo;

import java.time.LocalDate;

public class DadosMotorista extends Motorista {
	private EntityManagerFactory emf;
	private EntityManager em;

	public DadosMotorista() {
		emf = Persistence.createEntityManagerFactory("motorista");
		em = emf.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return em;
	}

	public void addMotorista(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Motorista newProp = new Motorista(nome, dataNascimento,cpf,sexo, numeroCNH);
		em.persist(newProp);
		em.getTransaction().commit();
		System.out.println("Motorista adicionado");
	}
	public void fecharConexao() {
		em.close();
		emf.close();
	}
}