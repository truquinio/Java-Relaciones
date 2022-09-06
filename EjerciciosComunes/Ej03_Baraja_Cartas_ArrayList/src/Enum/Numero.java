/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author FT
 */
public enum Numero {

    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), DIEZ(10), ONCE(11), DOCE(12);

    private int numero;

///CONSTR:
    private Numero(int numero) {
        this.numero = numero;
    }

///G&S:
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

///ToSTRING:
    @Override
    public String toString() {
        return "" + numero;
    }
}