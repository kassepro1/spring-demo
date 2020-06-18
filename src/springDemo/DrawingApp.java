package springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Triangle triangle = new Triangle();
		//ApplicationContext factory =  new FileSystemXmlApplicationContext("D:\\WorkspaceEclipse\\springDemo\\spring.xml");

		AbstractApplicationContext context =  new FileSystemXmlApplicationContext("D:\\WorkspaceEclipse\\springDemo\\spring.xml");
        context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
	}

}
