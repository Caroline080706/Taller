
public class Automovil {
    String marca;
    int mdelo;
    int motor;
    enum tipoCom {GASOLINA,BIOETANOL,DIESEL,BIODIESEL,
    GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA{CIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,
    EJECUTIVO,SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {BLANC,NEGRO,ROJO,NARANJA,
    AMARILLO,VERDE,AZUL,VIOLETA}
    tipoColor color;
    int velocidadActual=0;
    
            

    public Automovil(String marca, int mdelo, int motor, 
            tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas,
            int cantidadAsientos, int velocidadMaxima,
            tipoColor color) {
        this.marca = marca;
        this.mdelo = mdelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }
    

    public String getMarca() {
        return marca;
    }
   
    public int getMdelo() {
        return mdelo;
    }
    
    public int getMotor() {
        return motor;
    }
    
    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    

    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
        
    }
    

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public tipoColor getColor() {
        return color;
    }
  
    public int getVelocidadActual() {
        return velocidadActual;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setMdelo(int mdelo) {
        this.mdelo = mdelo;
    }
    
    public void setMotor(int motor) {
        this.motor = motor;
    }
    
    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void setColor(tipoColor color) {
        this.color = color;
    }
    
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int incrementoVelocidad){
        if(velocidadActual + incrementoVelocidad<velocidadMaxima){
        }else{
            System.out.println("no se puede imcrementar a una velocidad"
                    + "superior a la maxima de automovil");
        }
    }
    void desacelerar(int decrementoVelocidad){
        if((velocidadActual- decrementoVelocidad)>0){
            velocidadActual = velocidadActual- decrementoVelocidad;
        }else{
            System.out.println("no se puede decrementar a una "
                    + "velocidad negativa");
        }
    }
    void frenar(){
        velocidadActual =0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    void imprimir(){
        System.out.println("marca="+ marca);
        System.out.println("modelo="+mdelo);
        System.out.println("motor="+ motor);
        System.out.println("tipo de combustible="+ tipoCombustible);
        System.out.println("tipo de automovil="+ tipoAutomovil);
        System.out.println("numero de puertas="+ numeroPuertas);
        System.out.println("cantidad de asientos="+ cantidadAsientos);
        System.out.println("velocidad maxima="+ velocidadMaxima);
        System.out.println("color="+ color);
        
    }
    public static void main(String[] args) {
        Automovil auto1= new
            Automovil("ford", 2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO,
            5,6,250,tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
            System.out.println("velocidad actual="+auto1.velocidadActual);
            auto1.acelerar(20);
            System.out.println("velocidad actual="+auto1.velocidadActual);
            auto1.desacelerar(50);
            System.out.println("velocidad actual=" + auto1.velocidadActual);
            auto1.frenar();
            System.out.println("velocidad actual="+auto1.velocidadActual);
            auto1.desacelerar(20);
            
    }


    }
/*}*/
