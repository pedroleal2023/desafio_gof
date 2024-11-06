 /**
 * Singleton "Lazy Holder"
 * 
 * @author pedroleal2023
 * 
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() { // Corrigido para SingletonLazyHolder
        return InstanceHolder.instancia;
    }
}
