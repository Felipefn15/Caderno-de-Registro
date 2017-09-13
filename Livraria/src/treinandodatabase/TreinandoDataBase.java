/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinandodatabase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe
 */
public class TreinandoDataBase {
    public String dbURL = null ;
    public String user = null;
    public String password = null;
    public TreinandoDataBase(String db, String user, String password){
        this.dbURL = db;
        this.user = user;
        this.password = password;
    }
    public Connection conectaDataBase(){
        Connection connect = null;
        try {
             connect = DriverManager.getConnection(dbURL, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(TreinandoDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    public Statement criaStatement(String dataBase,String table){
        Connection connect = conectaDataBase();
        Statement state = null;
        int i;
        ResultSet rs= null;
        
        try {
            DatabaseMetaData dbm = connect.getMetaData();
            state = connect.createStatement();
            rs = dbm.getTables(null, null, table, null);
            if(rs.next())
                i = 1;
            else
                
                state.executeUpdate("create table if not exists "+ table +
                                    "(id int not null auto_increment primary key,titulo varchar(180),autor varchar(100),lancado date);"); 
        } catch (SQLException ex) {
            Logger.getLogger(TreinandoDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return state;
    }
    public void fazUpdate( String dataBase,String table,String acao){
        Statement state = criaStatement(dataBase,table);
        try {
            state.executeUpdate(acao);
        } catch (SQLException ex) {
            Logger.getLogger(TreinandoDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet fazQuery(String dataBase,String tabela,String acao){
        Statement state = criaStatement(dataBase,tabela);
        ResultSet rs = null;
        try {
            rs = state.executeQuery(acao);
        } catch (SQLException ex) {
            Logger.getLogger(TreinandoDataBase.class.getName()).log(Level.SEVERE, null, ex);
       }
        return rs;
    }
    public ResultSet retornaLivros(String dataBase,String tabela){
       Statement state = criaStatement(dataBase,tabela);
        ResultSet rs = null;
        try {
            rs = state.executeQuery("select * from "+tabela);
        } catch (SQLException ex) {
            Logger.getLogger(TreinandoDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
