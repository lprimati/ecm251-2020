package com.company.enums;
/**
 *tipos de mangas conhecidos (vou procurar os nomes em portugues pra que eu entenda
 *visto no site anime list (tem todos esses tipos)
 * @version 1.0
 * @since  20/09/2020
 * @author Lucas Menezes
 * */
public enum TiposMangas {
    MANGA("manga"),
    NOVEL("novel"),
    ONESHOT("oneshot"),
    DOUJIN("doujin"),
    MANHWA("manhwa"),
    MANHUA("manhua");



    private String display;
    TiposMangas(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
