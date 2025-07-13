package OOP2_Coding_Challenges.CodingChallenge7_SOLID.DependencyInversionPrinciple.Violates;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
