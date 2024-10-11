
public class Planeta1 {
    String nombre = null;
    int cantidadSatelite =0;
    double masa =0;
    double volumen =0;
    int diametro = 0;
    int distanciaSol = 0;

    private Planeta1(String tierra, int i, double d, int i0, int i1, int i2,
            tipoPlaneta tipoPlaneta, boolean b) {
        
    }
    enum tipoPlaneta{GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean esObservable= false;
    
    Planeta1 (String nombre,int cantidadSatelite,double masa,
            double volumen,int diamtero, int distanciaSol, tipoPlaneta tipo,
            boolean esObservable){
        this.nombre = nombre;
        this.cantidadSatelite = cantidadSatelite;
        this.masa= masa;
        this.volumen= volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        
    }
    void imprimir(){
        System.out.println("nombre del paneta"+nombre);
        System.out.println("cantidad de satelite"+cantidadSatelite);
        System.out.println("cantidad de masa"+masa);
        System.out.println("volumen del planeta"+ volumen);
        System.out.println("diametro del planeta"+diametro);
        System.out.println("distancia al sol"+ distanciaSol);
        System.out.println("tipo de planeta"+ tipo);
        System.out.println("es observable"+esObservable);
    }
    double calcularDensidad(){
        return masa/volumen;
    
    }
    boolean esPlanetaExterior(){
        float limite=(float)(149597870*3.4);
        if (distanciaSol>limite){
            return true ;
        }else{
            return false ;
            
        }
    
    }
    public static void main (String args[]){
        Planeta pl= new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,
                150000000,tipoPlaneta.TERRESTRE,true);
                pl.imprimir();
                System.out.println("densidad del planeta ="+
                        pl.calcularDensidad());
                System.out.println("es planeta exterior ="+
                        pl.esPlanetaExterior());
                System.out.println();
                Planeta p2 =new Planeta("jupiter",79,1.899E27,1.4313E15,
                139820,750000000,tipoPlaneta.GASEOSO,true);
                p2.imprimir();
                System.out.println("densidad del planeta ="+
                        p2.calcularDensidad());
                System.out.println("es palneta exterior="+
                        p2.esPlanetaExterior());                   
    
    } 
    
}
