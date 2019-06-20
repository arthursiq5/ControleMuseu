/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import brain.geral.Arquivo;
import src.aux.GeradorDeCaminho;
import src.negocio.Museu;

/**
 *
 * @author arthur.siqueira
 */
public class MuseuDaoTxt implements MuseuDao{
    private Arquivo roletaNorte;
    private Arquivo roletaSul;
    @Override
    public void criaBase(String nomeDoMuseu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void fechaArquivos(){
        this.roletaNorte.fecharArquivo();
        this.roletaSul.fecharArquivo();
    }
    
    private void initArquivos(String nomeMuseu){
        this.roletaNorte = new Arquivo(
                GeradorDeCaminho.geraCaminhoRoletaNorte(nomeMuseu)
        );
        this.roletaSul = new Arquivo(
                GeradorDeCaminho.geraCaminhoRoletaSul(nomeMuseu)
        );
    }

    @Override
    public Museu buildMuseu(String nomeDoMuseu) {
        this.initArquivos(nomeDoMuseu);
        try {
            this.fechaArquivos();
            if(this.roletaNorte.abrirLeitura()&&
               this.roletaSul.abrirLeitura()){
                return new Museu(nomeDoMuseu, 
                    (Integer.parseInt(this.roletaNorte.lerLinha())), 
                    (Integer.parseInt(this.roletaSul.lerLinha()))
                );
            }else{
                this.roletaNorte.abrirEscrita();
                this.roletaSul.abrirEscrita();
                return new Museu(nomeDoMuseu);
            }
        } catch (NumberFormatException e) {
            return new Museu(nomeDoMuseu);
        }
    }

    @Override
    public void saveData(Museu museu) {
        this.fechaArquivos();
        this.roletaNorte.abrirEscrita();
        this.roletaNorte.escreverLinha(museu.getContInfRoletaNorte() + "");
        this.roletaSul.abrirEscrita();
        this.roletaSul.escreverLinha("" + museu.getContInfRoletaSul());
        this.fechaArquivos();
    }
    
}
