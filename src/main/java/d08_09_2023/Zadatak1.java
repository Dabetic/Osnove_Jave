package d08_09_2023;

//1.	Napisati klasu Proizvod koja ima atribute
//a.	naziv proizvoda (String)
//b.	cenu proizvoda (double)
//c.	težinu proizvoda u gramima. (double)
//	i metode:
//d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//-	za tezinu do 100g, postarina iznosi 200din
//-	za tezinu od 101g do 500g, postarina iznosi 400din
//-	za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();

        proizvod1.nazivP = "Hleb";
        proizvod1.cenaP = 72.99;
        proizvod1.tezinaP = 500.00;

        Proizvod proizvod2 = new Proizvod();

        proizvod2.nazivP = "Brasno";
        proizvod2.cenaP = 110.99;
        proizvod2.tezinaP = 1000;

        proizvod1.stampanje();

        proizvod1.povecajCenu(80.0);

        proizvod1.stampanje();

        proizvod1.racunajPostarinu();


        proizvod2.stampanje();

        proizvod2.povecajCenu(130.0);

        proizvod2.stampanje();

        proizvod2.racunajPostarinu();




    }
}
