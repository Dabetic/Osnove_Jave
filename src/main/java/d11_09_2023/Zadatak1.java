package d11_09_2023;

// Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

public class Zadatak1 {
    public static void main(String[] args) {

        Autor autor1 = new Autor();

        autor1.setIme("Luis");
        autor1.setPrezime("Carol");

        Autor autor2 = new Autor();

        autor2.setIme("Carls");
        autor2.setPrezime("Latvidz Dodzson");


        Knjiga knjiga1 = new Knjiga(autor1,autor2);

        knjiga1.setIsbn("IN - 179555671 - BN");
        knjiga1.setNaslov("Alisa u zemlji cuda");
        knjiga1.setGodinaIzdanja(1865);

        System.out.println("**********");

        knjiga1.stampanje();


        Autor autor4 = new Autor();
        Knjiga knjiga2 = new Knjiga(autor2);

        knjiga2.setIsbn("IN - 99999888741 - BN");
        knjiga2.setNaslov("Ko to cepa drva u 6 ujutru?");
        knjiga2.setGodinaIzdanja(2023);

        System.out.println("**********");

        knjiga2.stampanje();

        Autor autor3 = new Autor();

        autor3.setIme("Miki");
        autor3.setPrezime("Miric");

        Knjiga knjiga3 = new Knjiga(autor3, autor1);

        knjiga3.setIsbn("IN - 8888888 - BN");
        knjiga3.setNaslov("Kafa za dvoje");
        knjiga3.setGodinaIzdanja(2023);

        System.out.println("**********");

        knjiga3.stampanje();


    }
}
