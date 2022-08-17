public class Ravenclaw extends hogwarts{
    private int intellect;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String studentName, String studentSurname, int transgrationDistance, int magicPower,
                     int intellect, int wisdom, int wittiness, int creativity) {
        super(studentName, studentSurname, transgrationDistance, magicPower);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }
    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        int griffindorRate1 = student1.creativity + student1.intellect + student1.wisdom + student1.wittiness;
        int griffindorRate2 = student2.creativity + student2.intellect + student2.wisdom + student2.wittiness;
        if (griffindorRate1 > griffindorRate2) {
            System.out.println(student1.getStudentName() + " лучший когтевранец, чем " + student2.getStudentName());
        } else {
            System.out.println(student2.getStudentName() + " лучший когтевранец, чем " + student1.getStudentName());
        }
    }
}
