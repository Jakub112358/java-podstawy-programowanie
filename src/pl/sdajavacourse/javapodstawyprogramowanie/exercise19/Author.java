package pl.sdajavacourse.javapodstawyprogramowanie.exercise19;

public class Author {
    private String surname;
    private Nationality nationality;

    public Author(String surname, Nationality nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public Author() {
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
