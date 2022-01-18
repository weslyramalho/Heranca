package models;


import utils.Autenticador;

public class Cliente implements Autenticador {
    private int id;
    private String nome;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String senha;

    public Cliente(int id, String nome, boolean status, String senha) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha != senha){
            System.out.println("Não autenticado!");
            return false;
        }else{
            System.out.println("Autenticado!");
            return true;
        }

    }
}

