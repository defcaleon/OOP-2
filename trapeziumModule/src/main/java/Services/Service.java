package Services;

import com.website.Services.IService;
import factory.TrapeziumFactory;
import interfaces.FigureFactory;


public class Service implements IService {

    @Override
    public FigureFactory doJob() {
        System.out.println("модуль трапеции подключен");
        return new TrapeziumFactory();
    }
}
