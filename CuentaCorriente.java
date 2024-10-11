
public class CuentaCorriente extends Cuenta{
    float sobregiro;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro=0;
        
    }
    @Override
    public void retirar(float cantidad){
        float resultado= saldo- cantidad;
        if(resultado <0){
            sobregiro= sobregiro- resultado;
            sobregiro=0;
            
        } else{
            super.retirar(cantidad);
        }
    }
    @Override
    public void consignar(float cantidad){
        float residuo= sobregiro- cantidad;
        if(sobregiro>0);
        if(residuo>0){
            sobregiro =0;
            saldo=residuo;
            
        }else{
            sobregiro= -residuo;
            saldo=0;
        }
    }else {
    super.consignar(saldo);
}
}


