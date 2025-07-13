package OOP2_Coding_Challenges.CodingChallenge7_SOLID.LiskovSubstitutionPrinciple.Adheres;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
