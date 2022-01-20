package db;

import models.Conta;
import models.ContaSalario;

import java.util.ArrayList;
import java.util.List;

public class ContasDB {
    private List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContasList(){
        return contasList;
    }
    public Conta getContaPorNumero(int numero){
        return contasList.stream()
                .filter((conta -> conta.getNumero() == numero))
                .findFirst()
                .get();
    }

    public void addConta(Conta novaConta){
        contasList.add(novaConta);
    }

}
