package boletin13;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Adestrador extends SeleccionFutbol {
private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirixirPartido(){
        System.out.println("O adestrador dirixe un partido");    
    }
    
    public void dirixirAdestramento(){
        System.out.println("O adestrador dirixe un partido");    
    }

    @Override
    public String toString() {
        return super.toString() + " idFederacion=" + idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os adestradores");
    }
    
    
    
    
    
}
