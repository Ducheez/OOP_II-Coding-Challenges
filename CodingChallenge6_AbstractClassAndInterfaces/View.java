package OOP2_Coding_Challenges.CodingChallenge_6_AbstractClassAndInterfaces;

public class View implements DataSource{
    @Override
    public void execute(){
        System.out.println("Some data to be displayed.");
    }
}
