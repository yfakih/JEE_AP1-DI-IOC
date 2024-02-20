package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation2 {

    public static void main(String[] args) {

        Scanner scanner;
            try {
                scanner = new Scanner(new File("config.txt"));
                String daoClassName = scanner.nextLine();
                IDao dao = (IDao) Class.forName(daoClassName).
                        getConstructor().newInstance();

                String metierClassName = scanner.nextLine();
                IMetier metier = (IMetier) Class.forName(metierClassName).
                        getConstructor(IDao.class).newInstance(dao);

                System.out.println(metier.calculate());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


    }


}
