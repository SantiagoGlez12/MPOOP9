class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    try{
    String mensajes[] = {"Uno","Dos","Tres"};
    for(int i=0;i<=3;i++)
      System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e);
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("Esta linea esta cool");

    System.out.println("*********Excepcion Anidada*********");
    try{
      Integer denominador = null;
      float equis = 5/denominador;
      System.out.println(equis);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }catch(NullPointerException e){
      System.out.println("Error: "+e.getMessage());
    }catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }

    System.out.println("***********Propagacion de Exception*********");
    
    try{
      imprimirArreglo();
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }finally{
      System.out.println("Cualquier cosa que suceda, entra en el finally");
    }

    System.out.println("***********Creacion de Excepcion*********");
    Cuenta cuenta = new Cuenta();
    try{
      cuenta.depositar(2000);
      cuenta.consultaSaldo();
      cuenta.retirar(800);
      cuenta.consultaSaldo();
      cuenta.retirar(1100);
      cuenta.consultaSaldo();
      cuenta.retirar(500);
      cuenta.consultaSaldo();
    }catch(SaldoInsuficienteException e){
      System.out.println("Error: "+e.getMessage());
      ofrecerTarjetaCredio();
    }catch(MontoInvalidoException e){
      System.out.println("Error: "+e.getMessage());
    }
  }

    public static void ofrecerTarjetaCredio(){
      System.out.println("Te interesa sacar una TDC?");
    }
    public static void imprimirArreglo() throws ArrayIndexOutOfBoundsException{
    String mensajes[] = {"Uno","Dos","Tres"};
    for(int i=0;i<=3;i++)
      System.out.println(mensajes[i]);
  }
}