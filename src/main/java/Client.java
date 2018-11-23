import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===========spring IOC===============");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		System.out.println(e1.toString());
	}

}
