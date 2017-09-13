package DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe
 */
public class DAO {
    public String dbURL = null ;
    public String user = null;
    public String password = null;
    
    public DAO(String db, String user, String password){
        this.dbURL = db;
        this.user = user;
        this.password = password;
    }
    public Connection Connection(){
        Connection connect = null;
        try {
             connect = DriverManager.getConnection(dbURL, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    public Statement criaStatement(){
        Connection connect = Connection();
        Statement state = null; 
        try {
            state = connect.createStatement();                
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return state;
    }
    public void update(String update){
        Statement state = criaStatement();
        try {
            state.executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(String table,String conteudo){
        Statement state = criaStatement();
        try {
            state.executeUpdate("insert into "+table +" values"+conteudo);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(String table,String id){
        Statement state = criaStatement();
        try {
                state.executeQuery("delete from "+table+" where id = "+id);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public ResultSet query(String query){
        Statement state = criaStatement();
        ResultSet rs = null;
        try {
            rs = state.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet searchByString(String table,String tipo,String escolha){
        PreparedStatement procura = null;
        ResultSet rs = null;
        Connection cn = Connection();
        try {
            procura = cn.prepareStatement("select * from "+table+" where ? =?");
            
            //achaId.setString(1, table);
            procura.setString(1, tipo);
            procura.setString(2, tipo);
            
            rs = procura.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet searchById(String table,int id){
        PreparedStatement procura = null;
        ResultSet rs = null;
        Connection cn = Connection();
        try {
            procura = cn.prepareStatement("select * from " + table + " where id = ?");

            //achaId.setString(1, table);
            procura.setInt(1, id);

            rs = procura.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}
