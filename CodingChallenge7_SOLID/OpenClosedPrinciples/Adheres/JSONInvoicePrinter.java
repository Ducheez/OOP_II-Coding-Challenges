package OOP2_Coding_Challenges.CodingChallenge7_SOLID.OpenClosedPrinciples.Adheres;

public class JSONInvoicePrinter implements InvoicePrinter {
    @Override
    public void print() {
        System.out.println("Printing invoice as JSON...");
    }
}

