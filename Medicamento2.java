
public class Medicamento2 {
    public static void main(String[] args)  {
        Medicamento medicamento =new Medicamento("aspirina","bayer","oral");
        Posologia posologia = medicamento.new 
        Posologia("adultos y mayores de 16 anios",500,"6 horas",
                "no se debe tomar este medicamento"
                        + "con el estomago vacio.");
        medicamento.setPosologia(posologia);
        medicamento.imprimir();
        medicamento.posologia.imprimir();
        
        
    }
    
}
