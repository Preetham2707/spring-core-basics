package jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfigJDBC.xml");
		EmpDao emp=(EmpDao)ac.getBean("obj1");
		Scanner sc = new Scanner(System.in);
		System.out.println(emp.saveData(new Emp(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next())));
	}

}
