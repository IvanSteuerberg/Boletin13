package boletin13;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Masaxista extends SeleccionFutbol {
private String titulacion;
private int anosExperiencia;

    public Masaxista() {  
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaxes(){
        System.out.println("O masaxista da masaxes");
    }

    @Override
    public String toString() {
        return super.toString() + " titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia ;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os masaxistas");
    }

    
    
}
