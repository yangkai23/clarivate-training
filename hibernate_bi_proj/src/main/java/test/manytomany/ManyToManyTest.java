package test.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.manytomany.Course;
import dto.manytomany.Trainee;

public class ManyToManyTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		Course c1=new Course();
		c1.setCourse_id(101);
		c1.setCourse_name("Java");
		
		Course c2=new Course();
		c2.setCourse_id(102);
		c2.setCourse_name("python");
		
		Course c3=new Course();
		c3.setCourse_id(103);
		c3.setCourse_name("Java_Script");
		
		Course c4=new Course();
		c4.setCourse_id(104);
		c4.setCourse_name("DSA");
		
		Trainee trainee1=new Trainee();
		trainee1.setTrainee_id(131);
		trainee1.setTrainee_name("Anirudh");
		
		Trainee trainee2=new Trainee();
		trainee2.setTrainee_id(132);
		trainee2.setTrainee_name("Hrushi");
		
		Trainee trainee3=new Trainee();
		trainee3.setTrainee_id(133);
		trainee3.setTrainee_name("Vishnu");
		
		List<Course> ac=new ArrayList<Course>();
		ac.add(c1);
		ac.add(c3);
		ac.add(c4);
		
		List<Course> hc=new ArrayList<Course>();
		hc.add(c2);
		
		List<Course> vc=new ArrayList<Course>();
		vc.add(c1);
		vc.add(c3);
		
		trainee1.setCourses(ac);
		trainee2.setCourses(hc);
		trainee3.setCourses(vc);
		
		List<Trainee> jt=new ArrayList<Trainee>();
		jt.add(trainee3);
		jt.add(trainee1);
		
		List<Trainee> pt=new ArrayList<Trainee>();
		pt.add(trainee2);
		
		List<Trainee> jst=new ArrayList<Trainee>();
		jst.add(trainee3);
		jst.add(trainee1);
		
		List<Trainee> dsat=new ArrayList<Trainee>();
		dsat.add(trainee1);
		
		c1.setTrainees(jt);
		c2.setTrainees(pt);
		c3.setTrainees(jst);
		c4.setTrainees(dsat);
		
		transaction.begin();
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityManager.persist(c4);
		entityManager.persist(trainee1);
		entityManager.persist(trainee2);
		entityManager.persist(trainee3);
		transaction.commit();
	}
}
