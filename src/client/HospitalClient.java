package client;
import model.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class HospitalClient {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring to inject the right object implementation in Hospital for building using Setter Injection
        //Also, bootstrapping the Hospital instantiation using factory
        Hospital hospital = (Hospital) context.getBean("hospital");

        ArrayList<Building> buildings = hospital.listFacilities();



        //Spring to inject the right object implementation in  using Setter injection




    }
}
