
package bancovirtual;

public class BancoVirtual {

 
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();{
        p1.numConta=1111;
        p1.setDono("Leonardo Santiago");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.numConta=2222;
        p2.setDono("Maria Piedade");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.sacar(150);
        p1.pagarMensal();
        
        p2.pagarMensal();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
       }
       
    }
    
}
