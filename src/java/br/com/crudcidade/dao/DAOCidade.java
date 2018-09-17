/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudcidade.dao;

import br.com.crudcidade.fw.Data;
import br.com.crudcidade.to.TOCidade;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carol
 */
public class DAOCidade {
    
    public static void inserir(Connection c, TOCidade t) throws Exception {
        
        StringBuilder sql = new StringBuilder();
        sql.append(" insert into cidade (cidade, uf) values (?,?) ");
        
        Data.executeUpdate(c, sql.toString(), t.getCidade(), t.getUf());
    }
    
    public static void alterar(Connection c, TOCidade t) throws Exception{
        
        StringBuilder sql = new StringBuilder();
        sql.append(" update cidade ");
        sql.append(" set cidade = ?, uf = ? ");
        sql.append(" where id = ? ");
        
        Data.executeUpdate(c, sql.toString(), t.getCidade(), t.getUf(), t.getId());
        
    }
    
    public static void excluir(Connection c, TOCidade t) throws Exception{
        
        StringBuilder sql = new StringBuilder();
        sql.append(" delete from cidade ");
        sql.append(" where id= ? ");
        
        Data.executeUpdate(c, sql.toString(),t.getId());
    }
    public static List<TOCidade> lista(Connection c) throws Exception{
        List<TOCidade> lista = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, cidade, uf from cidade ");
        sql.append(" order by cidade");
        
        try (ResultSet r = Data.executeQuery(c, sql.toString())){
            
            while (r.next()){
                TOCidade t= new TOCidade();
                t.setId(r.getInt("id"));
                t.setCidade(r.getString("cidade"));
                t.setUf(r.getString("uf"));
                
                lista.add(t);
            }
        }
        return lista;
    }
    public static List<TOCidade> l(Connection c, String busca) throws Exception{
        List<TOCidade> lista = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, cidade, uf from cidade ");
        sql.append(" where cidade like concat(?, '%'");
        sql.append(" order by cidade ");
        
        try (ResultSet r = Data.executeQuery(c, sql.toString(), busca)){
            
            while(r.next()){
                TOCidade t =new TOCidade();
                t.setId(r.getInt("id"));
                t.setCidade(r.getString("cidade"));
                t.setUf(r.getString("uf"));
                
                lista.add(t);
            }
        }
        return lista;
        
        
    }
    
    public static TOCidade obter(Connection c, TOCidade t) throws Exception{
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, cidade, uf from cidade ");
        sql.append(" where id = ? ");
        
        try (ResultSet r = Data.executeQuery(c, sql.toString(), t.getId())){
            
            if (r.next()){
                t = new TOCidade();
                t.setId(r.getInt("id"));
                t.setCidade(r.getString("cidade"));
                t.setUf(r.getString("uf"));
                return t;                
            } else {
                return null;
            }
        }
    }
}
    

