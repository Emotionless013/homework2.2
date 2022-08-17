public class hogwartsService {

    public void print(Griffindor student) {
        System.out.println(student.toString() +
                ", nobility: " + student.getNobility() + ", honor: " + student.getHonor() +
                ", bravery: " + student.getBravery());
    }

    public void print(Hufflepuff student) {
        System.out.println(student.toString() +
                ", diligence: " + student.getDiligence() + ", honesty: " + student.getHonesty() +
                ", loyalty: " + student.getLoyalty());
    }

    public void print(Ravenclaw student) {
        System.out.println(student.toString() +
                ", intellect: " + student.getIntellect() + ", wisdom: " + student.getWisdom() +
                ", wittiness: " + student.getWittiness() + ", creativity: " + student.getCreativity());
    }

    public void print(Slytherin student) {
        System.out.println(student.toString() +
                ", slyness: " + student.getSlyness() + ", decisiveness: " + student.getDecisiveness() +
                ", ambitiousness: " + student.getAmbitiousness() + ", resourcefulness: " + student.getResourcefulness() +
                ", thirstForPower: " + student.getThirstForPower());
    }

}
