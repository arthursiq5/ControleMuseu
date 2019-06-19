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
public enum Caminho {
    SALVAR_ROLETA_SUL("roleta_caminho_sul.let"),
    SALVAR_ROLETA_NORTE("roleta_caminho_norte.let");
    
    private final String caminhoDoArquivo;

    private Caminho(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }
    
    public String getCaminhoDoArquivo(){
        return this.caminhoDoArquivo;
    }
    
    
}
