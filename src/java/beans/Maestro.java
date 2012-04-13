/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author usuario
 */
public class Maestro {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaDeIngreso;
    private String fechaDeNacimiento;
    private String medioInforme;
    private String direccion;
    private String curp;
    private String sexo;
    private String rfc;
    private String cel;
    private String estudios;
    private String edoCivil;
    private String inicioContrato;
    private String puesto;
    private int sueldo;
    private String numImss;

    public Maestro() {
        nombre = null;
        apellidoPaterno = null;
        apellidoMaterno = null;
        fechaDeIngreso = null;
        fechaDeNacimiento = null;
        medioInforme = null;
        direccion = null;
        curp = null;
        sexo = null;
        rfc = null;
        cel = null;
        estudios = null;
        edoCivil = null;
        inicioContrato = null;
        puesto = null;
        sueldo = 0;
        numImss = null;
    }

    public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaDeIngreso, String fechaDeNacimiento, String medioInforme,
            String direccion, String curp, String sexo, String rfc, String cel, String estudios, String edoCivil, String inicioContrato,
            String puesto, int sueldo, String numImss) {
        nombre = this.nombre;
        apellidoPaterno = this.apellidoPaterno;
        apellidoMaterno = this.apellidoMaterno;
        fechaDeIngreso = this.fechaDeIngreso;
        fechaDeNacimiento = this.fechaDeNacimiento;
        medioInforme = this.medioInforme;
        direccion = this.direccion;
        curp = this.curp;
        sexo = this.sexo;
        rfc = this.rfc;
        cel = this.cel;
        estudios = this.estudios;
        edoCivil = this.edoCivil;
        inicioContrato = this.inicioContrato;
        puesto = this.puesto;
        sueldo = this.sueldo;
        numImss = this.numImss;
    }

    public void setNombre(String nombre) {
        nombre = this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        apellidoPaterno = this.apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        apellidoMaterno = this.apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        fechaDeIngreso = this.fechaDeIngreso;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        fechaDeNacimiento = this.fechaDeNacimiento;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setMedioInforme(String medioInforme) {
        medioInforme = this.medioInforme;
    }

    public String getMedioInforme() {
        return medioInforme;
    }

    public void setDireccion(String direccion) {
        direccion = this.direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCurp(String curp) {
        curp = this.curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setSexo(String sexo) {
        sexo = this.sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setRfc(String rfc) {
        rfc = this.rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setCel(String cel) {
        cel = this.cel;
    }

    public String getCel() {
        return cel;
    }

    public void setEdoCivil(String edoCivil) {
        edoCivil = this.edoCivil;
    }

    public String getEdoCivil() {
        return edoCivil;
    }

    public void setInicioContrato(String inicioContrato) {
        inicioContrato = this.inicioContrato;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setPuesto(String puesto) {
        puesto = this.puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSueldo(int sueldo) {
        sueldo = this.sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNumImss(String numImss) {
        numImss = this.numImss;
    }

    public String getNumImss() {
        return numImss;
    }
}
