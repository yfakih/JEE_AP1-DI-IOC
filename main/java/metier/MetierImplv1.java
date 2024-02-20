package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImplv1 implements IMetier {

    private IDao dao;

    public MetierImplv1(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        var temp = this.dao.getData();
        return temp * 10;
    }
}
