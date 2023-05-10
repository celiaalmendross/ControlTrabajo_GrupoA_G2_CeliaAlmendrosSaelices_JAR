
public class Contenedor {

    private int identificador;
    private int peso;
    private String pais;
    private boolean aduanas;
    private int prioridad;
    private String descripcion_contenido;
    private String empresa_que_envia;
    private String empresa_que_recibe;

    public Contenedor(int identificador, int peso, String pais, boolean aduanas, int prioridad, String descripcion_contenido, String empresa_que_envia, String empresa_que_recibe ){
        this.identificador = identificador;
        this.peso = peso;
        this.pais = pais;
        this.aduanas = aduanas;
        this.prioridad= prioridad;
        this.descripcion_contenido = descripcion_contenido;
        this.empresa_que_envia = empresa_que_envia;
        this.empresa_que_recibe = empresa_que_recibe;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isAduanas() {
        return aduanas;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion_contenido() {
        return descripcion_contenido;
    }

    public void setDescripcion_contenido(String descripcion_contenido) {
        this.descripcion_contenido = descripcion_contenido;
    }

    public String getEmpresa_que_envia() {
        return empresa_que_envia;
    }

    public void setEmpresa_que_envia(String empresa_que_envia) {
        this.empresa_que_envia = empresa_que_envia;
    }

    public String getEmpresa_que_recibe() {
        return empresa_que_recibe;
    }

    public void setEmpresa_que_recibe(String empresa_que_recibe) {
        this.empresa_que_recibe = empresa_que_recibe;
    }

}
