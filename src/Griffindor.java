public class Griffindor extends hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String studentName, String studentSurname, int transgrationDistance,
                      int magicPower, int nobility, int honor, int bravery) {
        super(studentName, studentSurname, transgrationDistance, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static void compare(Griffindor student1, Griffindor student2) {
        int griffindorRate1 = student1.bravery + student1.honor + student1.nobility;
        int griffindorRate2 = student2.bravery + student2.honor + student2.nobility;
        if (griffindorRate1 > griffindorRate2) {
            System.out.println(student1.getStudentName() + " лучший грифиндорец, чем " + student2.getStudentName());
        } else {
            System.out.println(student2.getStudentName() + " лучший грифиндорец, чем " + student1.getStudentName());
        }
    }
}
