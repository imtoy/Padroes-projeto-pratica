package dio.innovation.one.single;

public class SingletonLazyHolder {

    private static class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }

}
