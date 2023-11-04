package dados;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Motorista;
import entities.enums.Sexo;

public class DadosMotorista extends Motorista {
	
	//static final long serialVersionUID = 1L;
	
	private EntityManagerFactory emf;
	private EntityManager em;

	public DadosMotorista() {
		emf = Persistence.createEntityManagerFactory("motorista");
		em = emf.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return em;
	}
	
	public void alterarMotorista(String cpf, LocalDate dataNascimento) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Motorista mot = em.find(Motorista.class, cpf);
		mot.setDataNascimento(dataNascimento);
		mot = em.merge(mot);
		em.getTransaction().commit();
	}
	
	

	public void addMotorista(String nome, LocalDate dataNascimento, String cpf, String email, Sexo sexo, String numeroCNH) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Motorista newProp = new Motorista(nome, dataNascimento, cpf, email, sexo, numeroCNH);
		em.persist(newProp);
		em.getTransaction().commit();
		System.out.println("Motorista adicionado");
	}
	
	public List<Motorista> listaMotoristas() {
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			List<Motorista> mot = em.createQuery("SELECT m FROM Motorista m", Motorista.class).getResultList();

			for (Motorista m : mot) {
				System.out.println("Nome: "+m.getNome()	 + " , " +
						 "Nascimento: "+m.getDataNascimento() 	 + " , " +
						 "CPF: "+m.getCpf()				 + " , " +
						 "Email: "+m.getEmail()			 + " , " +
						 "Sexo: "+m.getSexo()			 + " , " +
						 "CNH: "+m.getNumeroCNH());
			}
			em.getTransaction().commit();
			return mot;
		} finally {
			fecharConexao();
		}
	}
	
	public void removerMotorista(String cpf) {
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
 			Motorista mot = em.find(Motorista.class, cpf);
			em.remove(mot);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
	}
	
	public void fecharConexao() {
		em.close();
		emf.close();
	}
}