/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import src.negocio.Museu;

/**
 *
 * @author arthur.siqueira
 */
public interface MuseuDao {
    public void criaBase(String nomeDoMuseu);
    public Museu buildMuseu(String nomeDoMuseu);
    public void saveData(Museu museu);
}
