package d11_09_2023;

import java.sql.SQLOutput;

public class Knjiga {

    private String isbn;
    private String naslov;
    private int godinaIzdanja;
    private Autor autor;

    private Autor autor2;

    public Knjiga(Autor autor, Autor autor2) {
        this.autor = autor;
        this.autor2 = autor2;
    }

    public Knjiga(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn = isbn;
    }
    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }
    public String getNaslov() {
        return this.naslov = naslov;
    }
    public void setNaslov (String naslov) {
        this.naslov = naslov;
    }

    public int getGodinaIzdanja () {
        return this.godinaIzdanja = godinaIzdanja;
    }
    public void setGodinaIzdanja (int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }
    public Autor getAutor () {
        return this.autor = autor;
    }
    public void setAutor () {
        this.autor = autor;
    }
    public Autor getAutor2 () {
        return this.autor2 = autor2;
    }
    public void setAutor2 (Autor autor2) {
        this.autor2 = autor2;
    }

    public void stampanje () {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naslov: " + this.naslov + " - Godina izdanja: " + this.godinaIzdanja);
        System.out.print("Autor: ");
        autor.stampanje();
        System.out.println();

        if(autor2!=null) {
            System.out.print("Autor 2: ");
            autor2.stampanje();
            System.out.println();
        }
    }

}
