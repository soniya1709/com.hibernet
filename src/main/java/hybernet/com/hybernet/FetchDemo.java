package hybernet.com.hybernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernet.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	//get and load
//	Student student=(Student)session.get(Student.class, 102);
//	System.out.println(student);
//	Student student1=(Student)session.get(Student.class, 102);
//	System.out.println(student1);
	Student student=(Student)session.load(Student.class, 102);
	System.out.println(student);
	Student student1=(Student)session.load(Student.class, 102);
	System.out.println(student1);
	session.close();
	factory.close();
}
}
