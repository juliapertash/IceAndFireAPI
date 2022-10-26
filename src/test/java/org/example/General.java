package org.example;

public class General {
    public String getBooks() {
        return books;
    }

    public String getCharacters() {
        return characters;
    }

    public String getHouses() {
        return houses;
    }

    private String books;
    private String characters;
    private String houses;

    public General(String books, String characters, String houses) {
        this.books = books;
        this.characters = characters;
        this.houses = houses;
    }
    public General (){

    }
}
