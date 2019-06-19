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
public class GeradorDeCaminho {
    public static String geraCaminhoRoletaNorte(String nomeMuseu){
        return "./" + nomeMuseu + Caminho
                .SALVAR_ROLETA_NORTE
                .getCaminhoDoArquivo();
    }
    public static String geraCaminhoRoletaSul(String nomeMuseu){
        return "./" + nomeMuseu + Caminho
                .SALVAR_ROLETA_SUL
                .getCaminhoDoArquivo();
    }
}
