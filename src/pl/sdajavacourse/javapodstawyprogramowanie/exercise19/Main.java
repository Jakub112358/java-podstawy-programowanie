package pl.sdajavacourse.javapodstawyprogramowanie.exercise19;

//Napisz program, składający się z kilku klas:
//a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
//b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość
// zwrotek wiersza)
//c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)
public class Main {
    public static void main(String[] args) {

        Author slowacki = new Author("Słowacki", "polish");
        Author mickiewicz = new Author("Mickiewicz", "polish");
        Author poe = new Author();
        poe.setSurname("Poe");
        poe.setNationality("american");

        Poem[] poems = new Poem[3];

        poems[0] = new Poem(slowacki, 40);
        poems[1] = new Poem(mickiewicz, 43);
        poems[2] = new Poem(poe, 45);

        checkLongestPoem(poems);


    }

    private static void checkLongestPoem(Poem[] poems) {
        int authorIndex = 0;
        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStropheNumbers() > poems[authorIndex].getStropheNumbers()) {
                authorIndex = i;
            }
        }
        System.out.println("author of poem with the highest number of strophes is " + poems[authorIndex].getCreator().getSurname());
    }
}
