public class Slytherin extends hogwarts {
    private int slyness;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String studentName, String studentSurname, int transgrationDistance, int magicPower,
                     int slyness, int decisiveness, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(studentName, studentSurname, transgrationDistance, magicPower);
        this.slyness = slyness;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getSlyness() {
        return slyness;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public static void compare(Slytherin student1, Slytherin student2) {
        int griffindorRate1 = student1.ambitiousness + student1.decisiveness + student1.resourcefulness +
                student1.slyness + student1.thirstForPower;
        int griffindorRate2 = student2.ambitiousness + student2.decisiveness + student2.resourcefulness +
                student2.slyness + student2.thirstForPower;
        if (griffindorRate1 > griffindorRate2) {
            System.out.println(student1.getStudentName() + " лучший слизеринец, чем " + student2.getStudentName());
        } else {
            System.out.println(student2.getStudentName() + " лучший слизеринец, чем " + student1.getStudentName());
        }
    }
}
