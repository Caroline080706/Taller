
public class Medicamento {
    String nombre;
    String fabricante;
    String viaAdministracion;
    Posologia posologia;
    
    

    public Medicamento(String nombre, String fabricante,
            String viaAdministracion, Posologia posologia ) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
        this.posologia = posologia;
        
    }

    Medicamento(String aspirina, String bayer, String oral) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPosologia(Posologia posologia) {
        this.posologia = posologia;
    }
    void imprimir(){
        System.out.println("nombre del medicamento=" + nombre);
        System.out.println("fabricante del medicamento="+ fabricante);
        System.out.println("via de administracion="+ viaAdministracion);
    }


}
