package boletin13;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Xogador extends SeleccionFutbol {
private int dorsal;
private int demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, int demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void xogarPartido(){
        System.out.println("Os xogadores xogan un partido");    
    }

    public void entrenar(){
        System.out.println("Entrenan os xogadores");    
    }

    @Override
    public String toString() {
        return super.toString() +" dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }







}
