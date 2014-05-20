/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import redesocial.Foto;

/**
 *
 * @author Fatinha de Sousa
 */
public interface FotoDaoIT {
    
    public void persisteFoto(Foto foto);
    
    public void excluiFoto(String id);
}
