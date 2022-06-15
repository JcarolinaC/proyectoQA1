package universidad.edificaciones;

public class Biblioteca {

    protected String nombre;
    protected Integer cantidadLibros;
    protected  Integer cantidadComputadores;
    protected  Integer numeroSillas;
    protected Integer numeroMesas;
    protected Integer numeroEstanterias;

    public Biblioteca(String nombre, Integer cantidadLibros, Integer cantidadComputadores, Integer numeroSillas, Integer numeroMesas, Integer numeroEstanterias) {
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
        this.cantidadComputadores = cantidadComputadores;
        this.numeroSillas = numeroSillas;
        this.numeroMesas = numeroMesas;
        this.numeroEstanterias = numeroEstanterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(Integer cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public Integer getCantidadComputadores() {
        return cantidadComputadores;
    }

    public void setCantidadComputadores(Integer cantidadComputadores) {
        this.cantidadComputadores = cantidadComputadores;
    }

    public Integer getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(Integer numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public Integer getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(Integer numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public Integer getNumeroEstanterias() {
        return numeroEstanterias;
    }

    public void setNumeroEstanterias(Integer numeroEstanterias) {
        this.numeroEstanterias = numeroEstanterias;
    }
}
