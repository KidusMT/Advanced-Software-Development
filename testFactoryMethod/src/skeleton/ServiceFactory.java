package skeleton;

public abstract class ServiceFactory {

    public Service createSomething(String type){
        Service service = createService(type);
        return service;
    }
    public abstract Service createService(String type);
}
