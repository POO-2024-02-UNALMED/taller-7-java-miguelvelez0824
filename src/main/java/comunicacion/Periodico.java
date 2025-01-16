package comunicacion;

public class Periodico extends Escrito {

    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
            String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int par){
        return getPaginas() * par * 10;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.fecha + "\n" +
               this.primicia;
    }

    //get and set
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String newFecha) {
        this.fecha = newFecha;
    }
    public String getPrimicia() {
        return primicia;
    }
    public void setPrimicia(String newPrimicia) {
        this.primicia = newPrimicia;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String newInter) {
        this.interpretacion = newInter;
    }
}