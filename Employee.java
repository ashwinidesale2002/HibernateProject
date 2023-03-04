package ProjEmphibernate.manytomany;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int empid;
	
	private String empname;
	@ManyToMany
	@JoinTable(name="Employee_Project_Join",joinColumns={@JoinColumn(name="empid")},inverseJoinColumns= {@JoinColumn(name="proid")})
	private List<Project> project;

	
	//GENERATE GETTER AND SETTER
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	//CONSTRUCTOR
	public Employee(int empid, String empname, List<Project> project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
