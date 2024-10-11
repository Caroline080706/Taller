
public class CuentaCorriente2 {

    private String saldo;
    private String comisionMensual;
    private String numeroConsignaciones;
    private String numeroRetiros;
    public void extractoMensual(){
        super.extractoMensual();
        
       
    }
    public void imprimir(){
        System.out.println("saldo=$"+ saldo);
        System.out.println("cargo mensual = $"+ comisionMensual);
        System.out.println("numero de transacciones = $"+ 
                (numeroConsignaciones + numeroRetiros));
        System.out.println("valor de sobregiro = $"+
                (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
    
}
