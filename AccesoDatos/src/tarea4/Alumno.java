package tarea4;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Marcos Paredes
 */

public class Alumno implements Serializable {
    private int nia;
    private String nombre;
    private String apellidos;
    private char genero;
    private Date fechaNacimiento;
    private String ciclo;
    private String curso;
    private String grupo;

    
    public Alumno(int nia, String nombre, String apellidos, char genero, Date fechaNacimiento, String ciclo, String curso, String grupo) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciclo = ciclo;
        this.curso = curso;
        this.grupo = grupo;
    }

   
    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public String getGrupo() {
        return grupo;
    }

	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciclo=" + ciclo + ", curso=" + curso + ", grupo=" + grupo
				+ "]";
	}
    
    
}
