package pl.sdajavacourse.javapodstawyprogramowanie.exercise19;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public static void checkLongestPoem(Poem[] poems) {
        int authorIndex = 0;
        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStropheNumbers() > poems[authorIndex].getStropheNumbers()) {
                authorIndex = i;
            }
        }
        System.out.println("author of poem with the highest number of strophes is " + poems[authorIndex].getCreator().getSurname());
    }

    public static void checkLongestPoem(Poem[] poems, int minNumberOfNames) {
        int authorIndex=-1;
        int helperIndex = 0;
        for (int i = 1; i < poems.length; i++) {
            if (poems[i].creator.getSurname().split("[ -]").length >= minNumberOfNames) {
                if (poems[i].getStropheNumbers() > poems[helperIndex].getStropheNumbers()) {
                    authorIndex = i;
                    helperIndex = i;
                }
            }
        }
        if (authorIndex == helperIndex) {
            System.out.printf("author of poem with >= than %d names and the highest number of strophes is %s %n",minNumberOfNames, poems[authorIndex].getCreator().getSurname());
        }
        else System.out.printf("no authors with >= than %d names", minNumberOfNames);
    }

public static int sumOfStrophes (Poem[] poems, Nationality nationality) {
        int counter = 0;
    for (Poem poem : poems) {
        if (poem.creator.getNationality().equals(nationality)) {
            counter += poem.getStropheNumbers();
        }
    }
        return counter;
}



}
