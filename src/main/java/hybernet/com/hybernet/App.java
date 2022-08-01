package hybernet.com.hybernet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;
import org.hibernate.type.DateType;

/**
 * Hello world!
 *
 */
public class App 

{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("project started");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernet.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	//creating Student
    	Student s=new Student();
    	s.setId(103);
    	s.setName("Ahvini");
    	s.setCity("Parner");
    	System.out.println(s);
//    	creating object of address class
    	Address ad=new Address();
    	ad.setStreet("street1");
    	ad.setCity("Delhi");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date());
    	ad.setX(1234.34);
    	//image adding
    	FileInputStream fis=new FileInputStream("src/main/java/car.png");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(s);
    	session.save(ad);
    	
    	tx.commit();
    	session.close();
    	System.out.println("done....");
    	
    }
}
