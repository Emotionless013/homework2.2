public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry", "Potter", 100, 70,
                67, 78, 100);
        Griffindor hermione = new Griffindor("Hermione", "Granger", 70,
                67, 56, 98, 83);
        Griffindor ron = new Griffindor("Ron", "Weasley", 120, 56,
                80, 90, 54);
        Hufflepuff zachariah = new Hufflepuff("Zachariah", "Smith", 65,
                87, 67, 34, 98);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 100,
                86, 87, 89, 88);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 88,
                71, 56, 77, 98);
        Ravenclaw zhou = new Ravenclaw("Zhou", "Chang", 67,
                66, 80, 54, 77, 90);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 87,
                54, 77, 67, 82, 23);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 112,
                81, 70, 59, 99, 85);
        Slytherin draco = new Slytherin("Draco", "Malfoy", 88,105,
                76,90,100,100,120);
        Slytherin graham = new Slytherin("Graham", "Montagu", 150,73,
                56,80,65,100,73);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 88,105,
                76,86,100,93,67);

        hogwartsService hogwartsService = new hogwartsService();
        hogwartsService.print(harry);
        hogwartsService.print(hermione);
        hogwartsService.print(graham);
        Griffindor.compare(harry, hermione);
        Hufflepuff.compare(zachariah, justin);
        Ravenclaw.compare(marcus, padma);
        Slytherin.compare(gregory, draco);
        hogwarts.compare(ron, cedric);
        hogwarts.compare(graham, zhou);
    }
}