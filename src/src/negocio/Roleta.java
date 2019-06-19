/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.negocio;

import brain.geral.Arquivo;

/**
 *
 * @author arthur.siqueira
 */
public class Roleta {
    private int contadorInfinito;
    private int contadorDiario;

    public Roleta() {
        this.contadorDiario = 0;
        this.contadorInfinito = 0;
    }
    public Roleta(int contadorInfinito) {
        this.contadorDiario = 0;
        this.contadorInfinito = contadorInfinito;
    }
    
    public void entrar(){
        this.contadorDiario++;
        this.contadorInfinito++;
    }
    
    public void sair(){
        this.contadorDiario--;
    }
    
    public int getContadorDiario(){
        return this.contadorDiario;
    }
    
    public int getContadorInfinito(){
        return this.contadorInfinito;
    }
}
