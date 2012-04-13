/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author usuario
 */
public class Usuario {

    private String guess;
    private String password;
    private int nivel;

    public Usuario() {
        guess = null;
        password = null;
        nivel = 0;
    }

    public Usuario(String guess, String password, int nivel) {
        guess = this.guess;
        password = this.password;
        nivel = this.nivel;
    }

    public void setGuess(String guess) {
        guess = this.guess;
    }

    public String getGuess() {
        return guess;
    }

    public void setPassword(String password) {
        password = this.password;
    }

    public String getPassword() {
        return password;
    }

    public void setNivel(int nivel) {
        nivel = this.nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
