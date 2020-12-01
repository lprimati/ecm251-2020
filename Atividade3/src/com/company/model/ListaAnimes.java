package com.company.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * ListaAnimes criada e construida
 * @since 20/09/2020
 * @version 1.0
 * @author Lucas Menezes
 * */

public class ListaAnimes {
    private List<Animes> animes;

    public ListaAnimes(){
        this.animes = new ArrayList<>();
    }

    public void addAnimes(Animes animes){
        this.animes.add(animes);
    }

    public final List<Animes> getAnimes(){
        return this.animes;
    }

    @Override
    public String toString(){
        return "ListaAnimes{" + "animes = " + animes + '}';
    }
}
