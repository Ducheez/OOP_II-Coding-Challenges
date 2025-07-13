package OOP2_Coding_Challenges.CodingChallenge7_SOLID.DependencyInversionPrinciple.Violates;

public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
