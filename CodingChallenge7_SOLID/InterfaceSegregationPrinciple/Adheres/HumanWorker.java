package OOP2_Coding_Challenges.CodingChallenge7_SOLID.InterfaceSegregationPrinciple.Adheres;

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human working...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating...");
    }
}

