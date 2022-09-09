package br.ulbra.DAO;

import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author s.lucas
 */
public class UsuarioDAO {

    Connection con;
    
    public UsuarioDAO() throws SQLException{
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario"
                    + " WHERE emailUsuario = ? and senhaUsuario = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        } return check;
    }
    
    public void create(Usuario usuario){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO tbUsuario(nomeUsuario, "
                    + "senhaUsuario, foneUsuario, sexoUsuario");
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            stmt.setString(3, usuario.getFoneUsuario());
            stmt.setString(4, usuario.getSexoUsuario());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        }catch(SQLException ex){
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
