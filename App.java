/*Write a program showing Many To Many relationship  between Employees and Project, 
 where every Employee is associated with more than 1 project and also many projects are assigned to 1 Employee */

package ProjEmphibernate.manytomany;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration(); //create configuration object
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();	//sessionfactory
    	
    	Employee emp=new Employee();
    	emp.setEmpid(101);
    	emp.setEmpname("pranali");
    	
    	Employee emp1=new Employee();
    	emp1.setEmpid(102);
    	emp1.setEmpname("aditi");
    	
    	Employee emp2=new Employee();
    	emp2.setEmpid(103);
    	emp2.setEmpname("ankita");
    	
    	
    	Project pr=new Project();
    	pr.setProid(1);
    	pr.setProname(".Net Project");
    	
    	Project pr1=new Project();
    	pr1.setProid(2);
    	pr1.setProname("java Project");
    	
    	Project pr2=new Project();
    	pr2.setProid(3);
    	pr2.setProname("data Science Project");
    	
    	List<Employee> empl=new ArrayList<Employee>();
   	    List<Project> pro=new ArrayList<Project>();
    	
   	    empl.add(emp);
   	    empl.add(emp1);
   	    empl.add(emp2);
   	    
   	    pr1.setEmployee(empl);
   	    pr.setEmployee(empl);
   	    
   	    
   	    pro.add(pr);
   	    pro.add(pr1);
   	    pro.add(pr2);
   	    emp.setProject(pro);
   	    emp1.setProject(pro);
   	    emp.setProject(pro);
   	    	
    	Session session=factory.openSession();
    	//BEGIN THE TRANSACTION
    	Transaction tx=session.beginTransaction();
    	session.save(emp);
    	session.save(emp1);
    	session.save(emp2);
    	session.save(pr);
    	session.save(pr1);
    	session.save(pr2);
    	tx.commit();
    	session.close();
    	factory.close();
    }


    }

