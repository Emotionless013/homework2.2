public class hogwarts {
    private final String studentName;
    private final String studentSurname;
    private final int transgrationDistance;
    private final int magicPower;

    public hogwarts(String studentName, String studentSurname, int transgrationDistance, int magicPower) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.transgrationDistance = transgrationDistance;
        this.magicPower = magicPower;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getTransgrationDistance() {
        return transgrationDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public static void compare(hogwarts student1, hogwarts student2) {
        int hogwartsRate1 = student1.magicPower + student1.transgrationDistance;
        int hogwartsRate2 = student2.magicPower + student2.transgrationDistance;
        if (hogwartsRate1 > hogwartsRate2) {
            System.out.println(student1.getStudentName() + " " + student1.studentSurname +
                    " обладает бОльшей мощностью магии, чем " + student2.getStudentName() + " " + student2.studentSurname);
        } else {
            System.out.println(student2.getStudentName() + " " + student2.studentSurname +
                    " обладает бОльшей мощностью магии, чем " + student1.getStudentName() + " " + student1.studentSurname);
        }
    }

    @Override
    public String toString() {
        return this.studentName + " " + this.studentSurname + ", transgration distance: " + this.transgrationDistance +
                ", magic power: " + this.magicPower;
    }
}
