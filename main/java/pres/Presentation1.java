package pres;

import dao.DaoImplv1;
import dao.IDao;
import metier.IMetier;
import metier.MetierImplv1;

public class Presentation1 {

    public static void main(String[] args) {

        IDao dao = new DaoImplv1();

        IMetier metier = new MetierImplv1(dao);

        System.out.println(metier.calculate());

    }
}
