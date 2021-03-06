package gimnasio.app;

import java.util.UUID;

public class Socio {

    private UUID numero_socio;
    private String nombre;
    private String telefono;
    private String email;
    private String cuenta_bancaria;
    private String tipo_cuota; //E (estudiante) J(jubilado) N(normal) V(vip) etc
    private int asistencia;
    private String contraseña;


    //public Socio(  ){}

    public Socio (String nombre, String telefono, String email, String cuenta_bancaria, String tipo_cuota){
        this.nombre=nombre;
        this. telefono=telefono;
        this.email=email;
        this.cuenta_bancaria=cuenta_bancaria;
        this.tipo_cuota=tipo_cuota;
    }
    
    
    /*public static UUID generateType4UUID() {
            UUID uuid = UUID.randomUUID();
            return uuid;
        }*/

    public Socio (String email){
        this.email = email;

    }

    public UUID getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(UUID numero_socio) {
        this.numero_socio = numero_socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public String getTipo_cuota() {
        return tipo_cuota;
    }

    public void setTipo_cuota(String tipo_cuota) {
        this.tipo_cuota = tipo_cuota;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
