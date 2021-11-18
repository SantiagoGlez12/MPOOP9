public class MontoInvalidoException extends Exception{
  public MontoInvalidoException(){
    super("Monto Invlido, no puedes depositar $20,000 en una exhibicion");
  }
}