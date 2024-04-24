package com.example.ProjetoIntermediario.Controller;


import com.example.ProjetoIntermediario.Ajuda;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {

    List<Ajuda> aluno = new ArrayList<>();

    @GetMapping("/")
    String raiz(){
        return "Raiz do projeto";
    }

    @GetMapping("/ajuda")
    @ResponseBody
  //  public List<Ajuda> ajuda(){
        return aluno;
    }

    @GetMapping("/ajuda")
        public ArrayList<Ajuda> (){
        AJuda ajuda1 = new Ajuda("João Vitor Rodrigues Rocha","RuneScape MMORPG");

                aluno.add(ajuda1);

        return aluno;
        }

        /* professor infelizmente, tentei de tudo mas eu não entendi nada de spring,
        n sei oq eu to fznd, nem pq n ta funcionando nada, mas tentei, vi video aula sobre
        pra tentar fazer pelo menos o basiquinho mas não deu, desculpa entregar um trabalho
        nesse nivel aí mas é o que deu, tentar recuperar a nota la na ultima prova. 😓
         */


}
