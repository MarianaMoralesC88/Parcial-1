package co.edu.uniquindio.devplus;

public class Proyecto {
    private string codigo;
    private Date fechaSolicitud,
    private Date fechaInicio;
    private Date fechaEntrega;
    private EstadoProyecto estado;
    private MetodoPago metodoPago;
    private double valorTotal;


    private Desarrollador[]listDesarrolladores;
    private ServicioAdicional[]listServicios;

    public Proyecto (string codigo, Date fechaSolicitud, Date fechaInicio,
                     Date fechaEntrega, MetodoPago){
        this.codigo = codigo;
        this.fechaSolicitud = fechaSolicitud;
        this.fecgaEntrega = fechaEntrega;
        this.metodoPago = metodoPago;
        this.estado = EstadoProyecto.PENDIENTE;
        this.valorTotal = 0.0;

        this,listDesarrolladores = new Desarrollador [10];
        this.listServicios = new ServicioAdicional[10];
    }
    public double calcularValorTotal(double descuento) {
        double subTotal = 0;
        this.valorTotal = subTotal - (subTotal * (descuento / 100));
        return this.valorTotal;
    }

    public boolean cambiarEstado(EstadoProyecto nuevoEstado){
        this.estado = estadoNuevo;
        return true;
    }

    public boolean confirmarProyecto(){
        this.estado = EstadoProyecto.CONFIRMADO;
        return true;
    }

    public boolean agregarDesarrollador(Desarrollador desarrollador) {
        for (int i = 0; i < listDesarrolladores.length; i++) {
            if (listDesarrolladores[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarServicio (ServicioAdicional servicio) {
        for (int i = o; i < listServicios.length; i++) {
            if (listServicios[i] == null) {
                listServicios[i] = servicio;
                return true;
            }
        }
        return fals;
    }

    public stirng getCodigo() {
        return codigo;
    }

    public void setCodigo(string codigo) {
        this.codigo = codigo,
    }

    public Date getFechaSolicitud() {
       return fechaSolicitud;
    }

    public void setFechaSolicitud(DateSolicitud) {
       this.fechaSolicitud = fechaSolicitu;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFecgaEntrega() {
        return fecgaEntrega,
    }

    public void setFecgaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega,
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public Desarrollador[] getListDesarrolladores() {
        return listDesarrolladores;
    }

    public void setListDesarrolladores(Desarrollador[] listDesarrolladores){
        this.listDesarrolladores = listDesarrolladores;
    }

    public ServicioAdicional[] getListServicios() {
        return listServicios;
    }

    public void setListServicios(ServicioAdicional[]listServicios){
        this.listServicios = listServicios;
    }
}
