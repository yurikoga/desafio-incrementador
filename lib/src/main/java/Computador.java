public class Computador {
    
    //atributo estático da classe
    private static int idContadora=0;
    
    //atributo de instância do objeto
    private int idComputador;
    
    ////método estático (pertence à classe) que incrementa e retorna o próximo ID
    public static int novoId(){
        //pré incremento, garante que o primeiro id não seja 0
        return ++idContadora;
    }
    
    //método setter, id do computador recebe o novo id
    public void setId(int id){
        this.idComputador=id ;
    }
    
    //método getter, retorna o id da instância atual do objeto
    public int getId(){
        return this.idComputador;
    }
    
}
