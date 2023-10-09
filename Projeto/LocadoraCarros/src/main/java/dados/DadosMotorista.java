package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Motorista;
import entities.enums.Sexo;

public class DadosMotorista extends Motorista {
	
	//private static final long serialVersionUID = 1L;
	
	private EntityManagerFactory emf;
	private EntityManager em;

	public DadosMotorista() {
		emf = Persistence.createEntityManagerFactory("motorista");
		em = emf.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return em;
	}
	
	public void alterarMotorista(String cpf, String dataNascimento) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Motorista mot = em.find(Motorista.class, cpf);
		mot.setDataNascimento(dataNascimento);
		mot = em.merge(mot);
		em.getTransaction().commit();
	}
	
	

	public void addMotorista(String nome, String dataNascimento, String cpf,String email, Sexo sexo, String numeroCNH) {
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
				System.out.println(m.getNome()	 + " , " +
						 m.getDataNascimento() 	 + " , " + 
						 m.getCpf()				 + " , " +
						 m.getEmail()			 + " , " +
						 m.getSexo()			 + " , " +
						 m.getNumeroCNH());
			}
			em.getTransaction().commit();
			return mot;
		} finally {
			fecharConexao();
		}
	}
	
	public void fecharConexao() {
		em.close();
		emf.close();
	}
}