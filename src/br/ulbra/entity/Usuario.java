package br.ulbra.entity;

/**
 * @author s.lucas
 */
public class Usuario {

    private int idUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private String foneUsuario;
    private String sexoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, String emailUsuario,
            String senhaUsuario, String foneUsuario, String sexoUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.foneUsuario = foneUsuario;
        this.sexoUsuario = sexoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getFoneUsuario() {
        return foneUsuario;
    }

    public void setFoneUsuario(String foneUsuario) {
        this.foneUsuario = foneUsuario;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    @Override
    public String toString() {

        return "ID: " + this.idUsuario
                + "\nNome: " + this.nomeUsuario
                + "\nEmail: " + this.emailUsuario
                + "\nSenha: " + this.senhaUsuario
                + "\nFone: " + this.foneUsuario
                + "\nSexo: " + this.sexoUsuario;
    }

}
