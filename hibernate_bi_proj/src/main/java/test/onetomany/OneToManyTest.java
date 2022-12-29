package test.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.onetomany.SocialMediaHandles;
import dto.onetomany.User;

public class OneToManyTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	
	User user=new User();
	user.setName("Shanmukha Anirudh");
	user.setAge(23);
	
	SocialMediaHandles handle1=new SocialMediaHandles();
	handle1.setUser_name("Anirudh2399");
	handle1.setPassword("Optimus@2399");
	handle1.setAccount_type("Twitter");
	handle1.setUser(user);
	
	SocialMediaHandles handle2=new SocialMediaHandles();
	handle2.setUser_name("anirudhshanmukha");
	handle2.setPassword("Optimus@2399");
	handle2.setAccount_type("instagram");
	handle2.setUser(user);
	
	List<SocialMediaHandles> handle=new ArrayList<SocialMediaHandles>();
	handle.add(handle1);
	handle.add(handle2);
	
	user.setAccounts(handle);
	
	transaction.begin();
	entityManager.persist(handle1);
	entityManager.persist(handle2);
	entityManager.persist(user);
	transaction.commit();
}
}
