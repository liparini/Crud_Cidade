/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudcidade.bo;

import br.com.crudcidade.dao.DAOEstado;
import br.com.crudcidade.fw.Data;
import br.com.crudcidade.to.TOEstado;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author carol
 */
public class BOEstado {
    
    public static List<TOEstado> lista() throws Exception {
        try (Connection c = Data.openConnection()) {
            return DAOEstado.lista(c);
        }
    }
    
       
}
