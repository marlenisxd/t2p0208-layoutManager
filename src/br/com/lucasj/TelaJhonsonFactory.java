package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

public class TelaJhonsonFactory implements TelaFactory {

    @Override
    public String getNome() {
        return "This is sparks dinamite!";
    }

    @Override
    public Tela create() {
        return new TelaJhonson();
    }
    
}
