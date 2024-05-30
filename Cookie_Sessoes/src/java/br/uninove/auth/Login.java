package br.uninove.auth;

public class Login {

    private String usuario;
    private String senha;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica() {
        if (this.usuario.equals("admin")
                && this.senha.equals("admin")) {
            return true;
        }
        return false;
    }
}