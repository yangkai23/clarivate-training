package dto.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@Column(unique = true)
	private int trainee_id;
	private String trainee_name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(inverseJoinColumns = {@JoinColumn(name = "cid")},joinColumns= {@JoinColumn(name="id")})
	private List<Course> courses;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}