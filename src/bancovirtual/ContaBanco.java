package bancovirtual;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Numero de conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Proprietario: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
        
    }
    
    public ContaBanco(){
    this.saldo = 0;
    this.status = false;
    
    
}
    public void setNumConta(int n){
    this.numConta=n;
}
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono=d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        this.status=st;
    }
    public boolean getStatus(){
        return status;
    }

    
   public void abrirConta(String t){
       this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        }else if ("CP".equals(t)){
            this.setSaldo(150);
        }
    }
   public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("ERRO! Conta nao pode ser fechada porque ainda tem dinheiro.");
        } else if (this.getSaldo()<0){
            System.out.println("ERRO! Conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
   public  void depositar(double v){
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Deposito realizado na conta de " + this.getDono());
           
       }else{
           System.out.println("Impossivel depositar!!!");
       }
        
    }
   public void sacar(double v){
       if (this.getStatus()){
           if (this.getSaldo()>=v){
               this.setSaldo(this.getSaldo()- v);
               System.out.println("Saque realizado na conta de " + this.getDono());
           } else {
               System.out.println("Saldo insuficiente");
}
           }else{
                   System.out.println("impossivel sacar de uma conta fechada");
                   }
       }
    public void pagarMensal(){
        int v=0;
        if (this.getTipo().equals("CC")){
            v=12;
        }else if (this.getTipo().equals("CP")){
            v=20;
        }
            if (this.getStatus()){
                if (this.getSaldo()>=v){
                    this.setSaldo(this.getSaldo()-v);
                    System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente"); }
                } else{
                System.out.println("Impossivel pagar");
                        
                        }
            }
        }
        
    
    
   
