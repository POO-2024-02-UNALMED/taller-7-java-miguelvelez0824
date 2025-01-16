package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, 
                 String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 5;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.idea + "\n" +
               Tesis.argumentos.length + "\n" +
               this.conclusion + "\n" +
               this.referencias;
    }

    // Get and Set
    public String getIdea() {
        return idea;
    }

    public void setIdea(String newIdea) {
        this.idea = newIdea;
    }

    public String[] getArgumentos() {
        return Tesis.argumentos;
    }

    public void setArgumentos(String[] newArg) {
        Tesis.argumentos = newArg;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String newConclusion) {
        this.conclusion = newConclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String newRef) {
        this.referencias = newRef;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String newInter) {
        this.interpretacion = newInter;
    }
}
