/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudcidade.dao;

import br.com.crudcidade.fw.Data;
import br.com.crudcidade.to.TOEstado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carol
 */
public class DAOEstado {
    
    public static List<TOEstado> lista (Connection c) throws Exception{
        StringBuilder sql = new StringBuilder();
        
        sql.append(" select uf from estado order by uf ");
        
        List<TOEstado> lista = new ArrayList<>();
        
        try (ResultSet r = Data.executeQuery(c, sql.toString())){
            while (r.next()){
                TOEstado t = new TOEstado();
                t.setUf(r.getString("uf"));
                lista.add(t);
            }
        }
        return lista;
    }
    
}
