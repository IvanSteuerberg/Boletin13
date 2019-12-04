package boletin13;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin13 {

    public static void main(String[] args) {

Xogador xog = new Xogador(11,11,1,"Pedro","Rodriguez",30);
Adestrador adest = new Adestrador("abc12",2,"Luis Enrique","Martinez",45);
Masaxista masax = new Masaxista("fisioterapeuta",10,3,"Juan","Perez",37);
SeleccionFutbol xog2 = new Xogador(19,9,4,"Iago","Aspas",32);
xog.concentrarse();
adest.concentrarse();
masax.concentrarse();
xog2.concentrarse();
//Móstrase o mesmo todo o tempo

xog.viaxar();
adest.viaxar();
masax.viaxar();
xog2.viaxar();
// Móstrase: viaxan os xogadores, adestradores ou masaxasistas dependendo do tipo de obxecto

xog.getApelido();
//Podo invocar a un método da superclase con un obxecto dunha subclase

SeleccionFutbol selec = new SeleccionFutbol(5,"Pepe","Mendez",45);
//Non podo invocar a un método da subclase con un obxecto do tipo da superclase








    }
    
}
