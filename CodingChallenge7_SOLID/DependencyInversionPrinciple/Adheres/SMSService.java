package OOP2_Coding_Challenges.CodingChallenge7_SOLID.DependencyInversionPrinciple.Adheres;

public class SMSService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
