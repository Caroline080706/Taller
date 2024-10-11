
class Posologia {
    String usuarios;
    int dosis;
    String periodo;
    String recomendaciones;
    public

    Posologia(String usuarios, int dosis, String periodo, 
            String recomendaciones) {
        this.usuarios = usuarios;
        this.dosis = dosis;
        this.periodo = periodo;
        this.recomendaciones = recomendaciones;
        
    }
    void imprimir(){
        System.out.println("Usuarios="+ usuarios);
        System.out.println("Dosis="+ dosis);
        System.out.println("Periodo="+ periodo);
        System.out.println("Recomendaciones="+ recomendaciones);
    }

    
}
