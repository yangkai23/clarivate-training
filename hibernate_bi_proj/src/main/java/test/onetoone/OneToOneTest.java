package test.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.onetoone.Id_Card;
import dto.onetoone.Student;

public class OneToOneTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Id_Card card=new Id_Card();
		card.setStudent_id(131);
		card.setSname("Anirudh");
		card.setBranch("mechanical");
		card.setYear("first");
		
		Student student=new Student();
		student.setStudent_name("Anirudh");
		student.setCard(card);
		
		card.setStudent(student);
			transaction.begin();
			entityManager.persist(card);
			entityManager.persist(student);
			transaction.commit();
	}
}
