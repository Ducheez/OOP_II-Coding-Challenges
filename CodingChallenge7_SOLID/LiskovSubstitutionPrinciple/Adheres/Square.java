package OOP2_Coding_Challenges.CodingChallenge7_SOLID.LiskovSubstitutionPrinciple.Adheres;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
