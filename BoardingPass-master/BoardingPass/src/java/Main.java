import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        BoardingPass bp = new BoardingPass();
        Boarding_Pass_Info a = new Boarding_Pass_Info();

        bp.firstLine(input, a);
        bp.secondLine(input, a);
        bp.ticketPrice(a);
    }
}