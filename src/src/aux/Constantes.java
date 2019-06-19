/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.aux;

/**
 *
 * @author arthur.siqueira
 */
public enum Constantes {
    LOTACAO_MAXIMA(2000);
    
    private final int valor;

    private Constantes(int valor) {
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
}
