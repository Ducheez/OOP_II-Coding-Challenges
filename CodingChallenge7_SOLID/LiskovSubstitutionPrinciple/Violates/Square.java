package OOP2_Coding_Challenges.CodingChallenge7_SOLID.LiskovSubstitutionPrinciple.Violates;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Violates Rectangle behavior!
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Violates Rectangle behavior!
    }
}
