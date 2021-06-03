package plugService;

import interfaces.FigureFactory;

public class BasicService implements IService {
    @Override
    public FigureFactory  doJob() {
        System.out.println("Basic service");
        return null;
    }
}
