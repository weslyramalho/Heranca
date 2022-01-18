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
    public void addNovaConta(Conta conta){
        contaList.add(conta);
    }


}
