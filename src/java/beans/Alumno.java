/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author usuario
 */
public class Alumno {

    private String nombre;
    private int matricula;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String carrera;
    private String fechaDeIngreso;
    private String fechaDeNacimiento;
    private String medioInforme;
    private String direccion;
    private String curp;
    private String sexo;

    public Alumno() {
        nombre = null;
        matricula = 0;
        apellidoPaterno = null;
        apellidoMaterno = null;
        carrera = null;
        fechaDeIngreso = null;
        fechaDeNacimiento = null;
        medioInforme = null;
        direccion = null;
        curp = null;
        sexo=null;
    }

    public Alumno(String nombre, int matricula, String apellidoPaterno, String apellidoMaterno, String carrera, String fechaDeIngreso, String fechaDeNacimiento, String medioInforme, String direccion, String curp, String sexo) {
        nombre = this.nombre;
        matricula = this.matricula;
        apellidoPaterno = this.apellidoPaterno;
        apellidoMaterno = this.apellidoMaterno;
        carrera = this.carrera;
        fechaDeIngreso = this.fechaDeIngreso;
        fechaDeNacimiento = this.fechaDeNacimiento;
        medioInforme = this.medioInforme;
        direccion = this.direccion;
        curp = this.curp;
        sexo=this.sexo;
    }

    public void setNombre(String nombre) {
        nombre = this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(int matricula) {
        matricula = this.matricula;
    }

    public int getMatricula() {
        return matricula;
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

    public void setCarrera(String carrera) {
        carrera = this.carrera;
    }

    public String getCarrera() {
        return carrera;
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
    public void setSexo(String sexo){
    sexo=this.sexo;
    }
    public String getSexo(){
    return sexo;
    }
}
