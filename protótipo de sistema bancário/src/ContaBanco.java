public class ContaBanco {
	 // atributos
	  public int numConta;
	  protected String tipo;
	  private String dono;
	  private double saldo;
	  private boolean status;

	  // métodos
	  public void abrirConta(String tipo) {
	    setTipo(tipo);
	    setStatus(true);
	    if (tipo == "Corrente"){
	      setSaldo(50);
	    }
	    else if (tipo == "Poupança"){
	      setSaldo(150);
	    }
	  }
	  public void fecharConta() { 
	    if (saldo > 0){
	      System.out.println("A conta não pode ser fechada pois possui saldo!");
	    }
	    else if (saldo < 0){
	      System.out.println("A conta não pode ser fechada pois há debitos!");
	    }
	    else{
	      setStatus(false);
	    }
	  }
	  public void depositar (double deposito) {
	    if (status == true){
	      setSaldo(getSaldo() + deposito);
	    }
	    else{
	      System.out.println("Impossivel depositar!");
	      
	    }
	  }
	  public void sacar(double saque) {
	    if (getSaldo() <= 0){
	      System.out.println("Você não possui saldo para sacar!");
	    } 
	    else if (getStatus() != true){
	      System.out.println("A conta não esta aberta!");
	    }
	    else{
	      setSaldo(getSaldo() - saque);
	    }
	  }
	  public void pagarMensal() {
	    double valor = 0;
	    if(getTipo() == "Corrente"){
	      valor = 12;
	    }
	    else if(getTipo() == "Poupança"){
	        valor = 20;
	    }
	    if (getStatus() == true){
	      if (getSaldo() > 0){
	        setSaldo(getSaldo() - valor);
	      }
	      else{
	        System.out.println("Saldo insuficiente!");
	      }
	    }
	    else{
	      System.out.println("Impossivel pagar");
	    }
	  }
	  public void mostrarConta() {
		  System.out.println(this.getNumConta());
		  System.out.println(this.getTipo());
		  System.out.println(this.getDono());
		  System.out.println(this.getSaldo());
		  System.out.println(this.getStatus());
	  }
	  
	  // métodos especiais
	  public ContaBanco() {
	    saldo = 0;
	    status = false;
	  }
	  public int getNumConta() {
	    return numConta;
	  }
	  public void setNumConta(int numConta) {
	    this.numConta = numConta;
	  }
	  public String getTipo() {
	    return tipo;
	  }
	  public void setTipo(String tipo) {
	    this.tipo = tipo;
	  }
	  public String getDono() {
	    return dono;
	  }
	  public void setDono(String dono) {
	    this.dono = dono;
	  }
	  public double getSaldo() {
	    return saldo;
	  }
	  public void setSaldo(double saldo) {
	    this.saldo = saldo;
	  }
	  public boolean getStatus() {
	    return status;
	  }
	  public void setStatus(boolean status) {
	    this.status = status;
	  }
}
