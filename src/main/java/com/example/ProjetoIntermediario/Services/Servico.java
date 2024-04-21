package com.example.ProjetoIntermediario.Services;


import com.example.ProjetoIntermediario.Ajuda;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Servico {
    private static final Map<Long, Ajuda> servicos = new HashMap<>();

    public Ajuda criar(Ajuda ajuda){
        ajuda.setEstudante("João Vitor Rodrigues Rocha");
        ajuda.setProjeto("MMORPG");

        return ajuda;
    }

    public List<Ajuda> getAll(){
        return new ArrayList<>(servicos.values());
    }

    public String deletar(Ajuda ajuda){
        servicos.remove(ajuda);
        return "Deletado";
    }
}
