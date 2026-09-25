package co.edu.uniquindio.devplus;

public class Cliente {
    private string nombreRazonSocial;
    private string documentoNit;
    private long telefono;
    private string correo;
    private string paisProcedencia;


    public Cliente (string nombreRazonSocial,string documentoNit,
                    long telefono,string correo, string paisProcedencia) {

        this.nombreRazonSocial = nombreRazonSocial
        this.documentoNit = documentoNit
        this.telefono = telefono
        this.correo = correo
        this.paisProcedencia = paisProcedencia;

    }

    public string getNombreRazonSocial(){
        return nombreRazonSocial;
}
    public void setNombreRazonSocial(string nombreRazonSocial){
        this.nombreRazonSocial = nombreRazonSocial;
    }
    public string getDocumentoNit(){
        return documentoNit;
    }

    public void setDocumentoNit(string documentoNit) {
        this.documentoNit = documentoNit;
    }

    public long getTelefono(){
        return telefono;
    }

    public void setTelefono(long telefono){
        this.telefono= telefono;
    }

    public string getCorreo() {
        return correo;
    }

    public void setCorreo(string correo){
        this.correo= correo;
    }

    public string getPaisProcedencia(){
        this.paisProcedencia= paisProcedencia;
    }
}