public class CepApi {

    private static CepApi instancia = new CepApi(); 

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() { // Corrigido para SingletonLazyHolder
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Itapoá";
    }

    
    public String recuperarEstado(String cep) {
        return "Santa Catarina";
    }
}

