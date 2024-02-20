package dao;

import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {


    @Override
    public double getData() {
        double data = 27;
        System.out.println("version web service ");
        return data;
    }
}
