package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Conta;

public class ContasDB {

    private List<Conta> contaList = new ArrayList<>();

    public List<Conta> getContaList(){
        return contaList;
    }
    public void addNovaConta(Conta novaConta){
        int id = contaList.size() + 1;
        novaConta.setId(id);
        contaList.add(novaConta);
    }


}
