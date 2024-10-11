
public class CuentaAhorro extends Cuenta{
    private boolean activa ;
    public CuentaAhorro(float saldo, float tasa){
        super(saldo,tasa);
        activa = saldo >= 10000;
                
    }
    @Override
    public void retirar(float cantidad){
       if(activa) 
           super.retirar(cantidad);
    }

    /**
     *
     * @param cantidad
     */
    @Override
    public void consignar(float cantidad){
        if(activa)
            super.consignar(cantidad);
    }
    @Override
    public void extractoMensual(){
        if (numeroRetiros >4){
            comisionMensual+=(numeroRetiros -4)*1000;
            
        }
        super.extractoMensual();
        if (saldo<10000)
            activa=false;
        
    }
    public void imprimir(){
        System.out.println("saldo=$"+ saldo);
        System.out.println("comision mensual= $"+comisionMensual);
        System.out.println("nuero de transacciones = "+
                (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
          
}
