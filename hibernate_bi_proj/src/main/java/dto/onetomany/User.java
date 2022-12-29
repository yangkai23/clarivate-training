package dto.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String name;
	private int age;
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<SocialMediaHandles> accounts;
	public List<SocialMediaHandles> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<SocialMediaHandles> accounts) {
		this.accounts = accounts;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
