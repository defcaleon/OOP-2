package service;

import factory.TrapeziumFactory;
import interfaces.FigureFactory;
import plugService.IService;


public class Service implements IService {

    @Override
    public FigureFactory doJob() {
        System.out.println("модуль трапеции подключен");
        return new TrapeziumFactory();
    }
}
