package hybernet.com.hybernet;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmdDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernet.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Student s1=new Student();
    	s1.setId(21);
    	s1.setName("Sham");
    	s1.setCity("Delhi");
    	Certificate c=new Certificate();
    	c.setCourse("Hibernate");
    	c.setDuration("6 month");
    	s1.setCerti(c);
    	Student s2=new Student();
    	s2.setId(11);
    	s2.setName("Ram");
    	s2.setCity("Pune");
    	Certificate c1=new Certificate();
    	c1.setCourse("Android");
    	c1.setDuration("2 month");
    	s2.setCerti(c1);
    	Session s=factory.openSession();
    	Transaction tx=s.beginTransaction();
    	s.save(s1);
    	s.save(s2);
    	tx.commit();
    	s.close();
    	factory.close();
    	
	}

}
