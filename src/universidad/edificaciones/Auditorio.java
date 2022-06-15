package universidad.edificaciones;

public class Auditorio {
    private String nombre;
    private  Integer aforo;
    private  Integer cantidadDeEquipos;

    public Auditorio(String nombre, Integer aforo, Integer cantidadDeEquipos) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.cantidadDeEquipos = cantidadDeEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public Integer getCantidadDeEquipos() {
        return cantidadDeEquipos;
    }

    public void setCantidadDeEquipos(Integer cantidadDeEquipos) {
        this.cantidadDeEquipos = cantidadDeEquipos;
    }
}
