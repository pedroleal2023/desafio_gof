public class Facade {
    
    public void migrarClient (Stirng nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarClient(nome, cep, cidade, estado);

    }
}
