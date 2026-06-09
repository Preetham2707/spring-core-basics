package Bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rc=new ClassPathResource("SpringConfig.xml");
		/*
		 * Loads XML file.

		Think:
		
		Java
		 ↓
		Read SpringConfig.xml
		 */
		BeanFactory bn=new XmlBeanFactory(rc);
		/*
		 * Creates Spring Container.

		Very important.
		
		What is Container?
		
		Container is Spring's manager.
		
		Responsibilities:
		
		creates objects
		stores objects
		manages objects
		gives objects when requested
		
		Think:
		
		Container
		    ↓
		Student Object
		 */
		Student s=(Student)bn.getBean("obj");
		/*
		 * This is the most important line.

		You are saying:
		
		Spring, give me bean named "obj".
		
		Spring searches:
		
		<bean id="obj" class="Bean.Student">
		
		finds it and returns the object.
		 */
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
	}
}
/*
 *-------------What is IOC?----------------

IOC means:

Inversion of Control

Normally:

Program creates object

Spring:

Spring creates object
Program uses object

Control is transferred to Spring.

Hence:

Inversion Of Control

------What is Dependency Injection?------------

Suppose:

class College
{
    Student s = new Student();
}

College depends on Student.

Spring can automatically provide Student object.

This process is called:

Dependency Injection
*/

/*-----FLOW OF PROGRAM-------------
Start Program
      ↓
Load XML
      ↓
Create Spring Container
      ↓
Container creates Student Object
      ↓
Container sets values
      ↓
getBean("obj")
      ↓
Object returned
      ↓
Print values
*/

/*
Interview Question
What is a Bean?

A Bean is an object created and managed by the Spring Container.

What is BeanFactory?

BeanFactory is the basic Spring Container used to create and manage beans.

What is IOC?

IOC means Spring creates and manages objects instead of the programmer creating them manually.

What is Dependency Injection?

Dependency Injection is the process of providing required objects to another object through Spring.
*/

/*
So today's class was actually teaching the heart of Spring:

✅ Bean
✅ BeanFactory
✅ IOC
✅ Dependency Injection
✅ Spring Container
✅ XML Configuration
*/