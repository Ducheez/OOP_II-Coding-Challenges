package OOP2_Coding_Challenges.CodingChallenge7_SOLID.InterfaceSegregationPrinciple.Violates;

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human working...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating...");
    }
}


