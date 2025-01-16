package comunicacion;

public class Fabula extends Escrito {

    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 1;
    }


    public String interpretacion() {
        return this.interpretacion;
    }


    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.ensenanzas;
    }

    // get and set
    public String getEnsenanza() {
        return ensenanzas;
    }
    

    public void setEnsenanza(String newEnsenanza) {
        this.ensenanzas = newEnsenanza;
    }

    public String getinterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String newInter) {
        this.interpretacion = newInter;
    }
}
