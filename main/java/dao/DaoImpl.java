package dao;

import org.springframework.stereotype.Component;

@Component(value = "dao")
public class DaoImpl implements IDao {


    @Override
    public double getData() {
        double temp = 23;
        System.out.println("version base de données");
        return temp;
    }
}
