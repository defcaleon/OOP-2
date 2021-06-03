package com.website.Services;

import interfaces.FigureFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public interface IService {

    FigureFactory  doJob();

    static List<IService> getServices(ModuleLayer layer) {
        return ServiceLoader
                .load(layer, IService.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
