package OOP2_Coding_Challenges.CodingChallenge7_SOLID.LiskovSubstitutionPrinciple.Violates;

// Client code that breaks
public class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Square(); // LSP violation starts here
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println("Expected area: 50");
        System.out.println("Actual area: " + rect.getArea()); // Outputs 100!
    }
}
