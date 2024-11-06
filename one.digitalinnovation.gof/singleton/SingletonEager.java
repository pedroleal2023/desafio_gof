/**
 * Singleton "apressado"
 * 
 * 
 * @author pedroleal2023
 */

 public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() { // Corrigido para SingletonEager
        return instancia;
    }
}
