/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudcidade.bo;

import br.com.crudcidade.dao.DAOCidade;
import br.com.crudcidade.fw.Data;
import br.com.crudcidade.to.TOCidade;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author carol
 */
public class BOCidade {
    
    public static void inserir(TOCidade t) throws Exception{
       try (Connection c = Data.openConnection()){
           DAOCidade.inserir(c,t);
       } 
    }
    public static void alterar(TOCidade t) throws Exception{
        try (Connection c = Data.openConnection()){
            DAOCidade.alterar(c,t);
        }
    }
     public static void excluir(TOCidade t) throws Exception{
        try (Connection c = Data.openConnection()){
            DAOCidade.excluir(c,t);
        }
       
}
      public static List<TOCidade> lista() throws Exception {
        try (Connection c = Data.openConnection()) {
            return DAOCidade.lista(c);
        }
    }

    public static TOCidade obter(TOCidade t) throws Exception {
        try (Connection c = Data.openConnection()) {
            return DAOCidade.obter(c, t);
        }
    }

}

