package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation4 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("dao", "metier");

        IMetier metier = (IMetier) applicationContext.getBean("metier2");

                System.out.println(metier.calculate());



    }


}
