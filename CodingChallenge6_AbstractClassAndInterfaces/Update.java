package OOP2_Coding_Challenges.CodingChallenge_6_AbstractClassAndInterfaces;

public class Update implements DataSource{
    @Override
    public void execute() {
        System.out.println("Data has been Updated Successfully!");
    }
}
