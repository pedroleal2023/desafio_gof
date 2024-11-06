public class Test {
    
    public static void main(String[] args) {
    
    //Singleton:

        SingletonLazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    
    
        SingletonEager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
    
        SingletonLazy = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    
    

        //Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new Comportamentonormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        
        //Facade:

        Facade facade = new Facade();
        facade.migrarClient("Pedro", "11122233")

    }



}
