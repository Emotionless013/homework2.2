public class Hufflepuff extends hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, String studentSurname, int transgrationDistance,
                      int magicPower, int diligence, int loyalty, int honesty) {
        super(studentName, studentSurname, transgrationDistance, magicPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        int griffindorRate1 = student1.diligence + student1.honesty + student1.loyalty;
        int griffindorRate2 = student2.diligence + student2.honesty + student2.loyalty;
        if (griffindorRate1 > griffindorRate2) {
            System.out.println(student1.getStudentName() + " лучший пуффендуец, чем " + student2.getStudentName());
        } else {
            System.out.println(student2.getStudentName() + " лучший пуффендуец, чем " + student1.getStudentName());
        }
    }
}
