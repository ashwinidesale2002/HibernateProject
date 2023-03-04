package ProjEmphibernate.manytomany;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Project {
	@Id
	private int proid;
	
	private String proname;
	@ManyToMany(mappedBy="project")
	private List<Employee> employee;

	
	//GENERATE GETTER AND SETTER
	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	//CONSTRUCTOR
	public Project(int proid, String proname, List<Employee> employee) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.employee = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
