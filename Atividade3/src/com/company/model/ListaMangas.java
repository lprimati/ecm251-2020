package com.company.model;

import java.util.ArrayList;
import java.util.List;
 /**
  * Lista de Animes
  * @version 1.0
  * @since 20/09/2020
  * @author Lucas Menezes
  * */
public class ListaMangas {
    private List<Mangas> mangas;


    public ListaMangas(){
        this.mangas = new ArrayList<>();
    }

    public void addManga(Mangas mangas){
        this.mangas.add(mangas);
    }

    public final List<Mangas> getMangas(){
        return this.mangas;
    }

    @Override
     public String toString(){
        return "ListaMangas{" + "mangas = " + mangas + '}';
    }
}
