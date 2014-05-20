/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryDaos;

/**
 *
 * @author Fatinha de Sousa
 */
public class FactoryDao {
    
    public static FactoryDaoIT createFactory(){
        return new FactoryDaoBD();
    }
}
