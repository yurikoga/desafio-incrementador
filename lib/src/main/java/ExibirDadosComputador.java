public class ExibirDadosComputador {
    public static void main(String[] args) {
        
        //número total de objetos a serem criados
        int numObjetos=10;
        
        //vetor de referência para objetos do tipo 'Computador'
        Computador[] computador=new Computador[numObjetos];
        
        //laço de repetição for, atribuição de id e exibição
        for (int indice = 0; indice < numObjetos; indice++) {
            //criação de objeto usando a variável 'indice' como indicador de posição no vetor
            computador[indice]=new Computador();
            
            //número de id atualizado é atribuído pelo método 'addId'
            computador[indice].setId(Computador.novoId());
            
           //exibe no console o id retornado pelo método 'getId' do objeto na posição 'indice'
            System.out.println("Id do computador: "+computador[indice].getId());
        }
    }
}
