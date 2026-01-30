
package ejerciciosingletonclase;

public class Cajero {
    private double saldoActual;
    
    // 1.- Definir una variable estática
    private static Cajero instancia;
    
    //2.- Crear un constructor privado
    private Cajero() {
    saldoActual = 0.0;
        System.out.println("Cajero listo");
    }
    
    //3.- Agregar un método público estático
    public static Cajero getInstancia(){
        if(instancia == null){
            instancia = new Cajero();
        }
        return instancia;
    }
    
    public void ingresarSaldo(double monto){
        saldoActual = monto;
        System.out.println("Saldo de su cuenta: " + saldoActual);
    }
    
    public void registrarDeposito(double deposito){
        saldoActual = saldoActual + deposito;
        System.out.println("Nuevo saldo actual: " + saldoActual);
    }
    
    public void registrarRetiro(double retiro){
        if(retiro < saldoActual){
            saldoActual = saldoActual - retiro;
            System.out.println("Nuevo saldo actual: " + saldoActual);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        
    }
    
    public double getSaldoActual(){
        return saldoActual;
    }
}
