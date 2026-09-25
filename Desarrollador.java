package co.edu.uniquindio.devplus;

public class Desarrollador {
    private String codigo;
    private String equipoTrabajo;
    private NivelDesarrollador;
    private int maxProyectosSimultaneos;
    private double tarifaDia;
    private EstadoDesarrollador estado;

    public Desarrollador(string codigo, string equipoTrabajo,
                         NivelDesarrollador, int maxProyectosSimultaneos,double tarifaDia){
        this,codigo = codigo,
        this.equipoTrabajo = equipoTrabajo;
        this.nivel = nivel;
        this.maxProyectosSimultaneos = maxProyectosSimultaneos;
        this.tarifaDia = tarifaDia;
        this.estado = EstadoDesarrollador.DISPONIBLE;

    }
    public boolean ValidarDisponibilidad(Date fechaInicio, Date fechaEntrega) {
        if (this,estado == EstadoDesarrollador.DISPONIBLE){
            return true;
        }
        return false;
    }
    public boolean actualizarDisponibilidad(EstadoDesarrollador nuevoEstado) {
        this.estado = nuevoEstado;
        return true
    }
    public string getcodigo() {
        return codigo;
    }
    public void setCodigo(string codigo){
        this.codigo = codigo;
    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }
    public void setEquipoTrabajo(string equipoTrabajo){
        this.equipoTrabajo = equipoTrabajo;
    }
    public NivelDesarrollador getNivel(){
        return nivel;
    }
    public void setNivel(NivelDesarrollador nivel){
    this. nivel = nivel
    }
    public int getMaxProyectosSimultaneos(){
        return maxProyectosSimultaneos;
    }
    public void setMaxProyectosSimultaneos(int maxProyectosSimultaneos){
        this.maxProyectosSimultaneos = maxProyectosSimultaneos;
    }
    public double getTarifaDia(){
        return tarifaDia;
    }
    public void setTarifaDia(double tarifaDia){
        this.tarifaDia = tarifaDia;
    }

    public EstadoDesarrollador getEstado() {
        return estado;
    }
    public void setEstado(EstadoDesarrollador estado){
        this.estado = estado;
    }
}






