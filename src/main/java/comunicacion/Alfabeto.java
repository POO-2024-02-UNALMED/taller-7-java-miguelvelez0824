package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < Alfabeto.letras.length; i++) {
            mensaje.append(Alfabeto.letras[i]);
            if (i != Alfabeto.letras.length - 1) {
                mensaje.append(", ");
            }
        }
        return mensaje.toString();
    }

    public int cantidadLetras() {
        return Alfabeto.letras.length;
    }

    // get and set
    public String[] getletras() {
        return letras;
    }

    public void setLetras(String[] newletras) {
        Alfabeto.letras = newletras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String newInter) {
        this.interpretacion = newInter;
    }
}
