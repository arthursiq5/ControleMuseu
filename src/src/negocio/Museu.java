/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.negocio;

import src.aux.Constantes;

/**
 *
 * @author arthur.siqueira
 */
public class Museu {
    private Roleta roletaNorte;
    private Roleta roletaSul;
    public final String nomeDoMuseu;
    private double valorArrecadado;
    private int lotacaoAtual;

    public Museu(String nomeDoMuseu) {
        this.nomeDoMuseu = nomeDoMuseu;
        
        // TODO modificar classe para puxar dados do arquivo salvo
        this.roletaNorte = new Roleta();
        this.roletaSul = new Roleta();
        this.valorArrecadado = 0;
        this.lotacaoAtual = 0;
    }
    public Museu(String nomeDoMuseu, int contRoletaNorte, int contRoletaSul) {
        this.nomeDoMuseu = nomeDoMuseu;
        
        // TODO modificar classe para puxar dados do arquivo salvo
        this.roletaNorte = new Roleta(contRoletaNorte);
        this.roletaSul = new Roleta(contRoletaSul);
        this.valorArrecadado = 0;
        this.lotacaoAtual = 0;
    }
    
    private void atualizaLotacao(){
        this.lotacaoAtual = this.roletaNorte.getContadorDiario() 
                + this.roletaSul.getContadorDiario();
    }
    
    private boolean verificaLotacao(){
        if(this.lotacaoAtual < Constantes.LOTACAO_MAXIMA.getValor()){
            return true;
        }else{
            return false;
        }
    }
    
    public void entrarRoletaNorte(){
        if(!this.verificaLotacao()) 
            throw new IllegalStateException("Lotação máxima atingida");
        this.valorArrecadado += 34;
        this.roletaNorte.entrar();
        this.atualizaLotacao();
    }
    
    public void sairRoletaNorte(){
        this.roletaNorte.sair();
        this.atualizaLotacao();
    }
    public void entrarRoletaSul(){
        if(!this.verificaLotacao()) 
            throw new IllegalStateException("Lotação máxima atingida");
        this.valorArrecadado += 34;
        this.roletaSul.entrar();
        this.atualizaLotacao();
    }
    
    public void sairRoletaSul(){
        this.roletaSul.sair();
        this.atualizaLotacao();
    }
    
    public double getValorArrecadado(){
        return this.valorArrecadado;
    }
    
    public int getContInfRoletaNorte(){
        return this.roletaNorte.getContadorInfinito();
    }
    public int getContInfRoletaSul(){
        return this.roletaSul.getContadorInfinito();
    }
}
