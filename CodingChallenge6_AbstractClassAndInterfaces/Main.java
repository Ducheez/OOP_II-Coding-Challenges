package OOP2_Coding_Challenges.CodingChallenge_6_AbstractClassAndInterfaces;

public class Main {
    public static void main(String[] args){
        Admin Admin1 = new Admin(1234, "Stephan", "xa1@LW42%3");
        User User1 = new User(4455, "John");

        Update Admin1Update = new Update();
        View User1View = new View();

        Admin1.performOperation(Admin1Update);
        User1.performOperation(User1View);
    }
}
