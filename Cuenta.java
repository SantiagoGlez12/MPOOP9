public class Cuenta{
  private double saldo;
  public Cuenta(){
    saldo = 0;
  }

  public void depositar(double monto) throws MontoInvalidoException{
    System.out.println("Depositando....");
    if(monto>20000)
      throw new MontoInvalidoException();
    else
      saldo+=monto;
  }

  public void retirar(double monto) throws SaldoInsuficienteException{
    int i=0;
    while(i<=3){
      System.out.println("Retirando....");
      if(saldo<monto)
        throw new SaldoInsuficienteException();
      else
        saldo-=monto;
      i++;
    }
  }

  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }
}