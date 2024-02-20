package pres;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Scanner;

public class Presentation3 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        IMetier metier = (IMetier) applicationContext.getBean("metier");

                System.out.println(metier.calculate());



    }


}
