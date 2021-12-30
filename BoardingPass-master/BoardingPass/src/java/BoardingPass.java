import java.util.Scanner;
import java.util.Random;

public class BoardingPass {

    public void firstLine(Scanner input, Boarding_Pass_Info a){
        Random random = new Random();
        Random rnd = new Random();
        int r1 = 10000 + rnd.nextInt(99999 - 100 );

        //Random Boarding Pass Number Generator
        System.out.println("Boarding Pass Number: " + r1);
        a.setBoardingPassNumber(r1);
        System.out.println("Aboue is your unique Boarding Pass Number. Press any key, then hit enter to continue with the Boarding Pass Information Setup");
        input.nextLine();


        System.out.println("Departure Date(MM/DD/YYYY): ");
        String setDate = input.nextLine();
        a.setDate(setDate);


        System.out.println("Origin: ");
        String setOrigin = input.nextLine();
        a.setOrigin(setOrigin);


        System.out.println("Destination: ");
        String setDestination = input.nextLine();
        a.setDestination(setDestination);


        //Random ETA generator
        int hour = random.nextInt(23);
        int minute = random.nextInt(59);
        String setETA = String.valueOf(hour) + ":" + String.valueOf(minute);


        System.out.println("Departure Time: ");
        String setDepartureTime = input.nextLine();
        a.setDepartureTime(setDepartureTime);


    }


    //Second line of info in Boarding pass
    public void secondLine(Scanner input, Boarding_Pass_Info a){

        System.out.println("Name: ");
        String setName = input.nextLine();
        a.setName(setName);


        System.out.println("Email: ");
        String setEmail = input.nextLine();
        a.setEmail(setEmail);


        System.out.println("Phone Number: ");
        String setPhoneNumber = input.nextLine();
        a.setPhoneNumber(setPhoneNumber);


        System.out.println("Gender(F/M): ");
        String setGender = input.nextLine();
        if (setGender != "M" || setGender != "F"){
            System.out.println("Please only enter M if you're male, or F if you're female. Try again.");
            input.nextLine();
        }else{
            a.setGender(setGender);
        }


        System.out.println("Age: ");
        int setAge = input.nextInt();
        if (setAge >= 100) {
            System.out.println("You're way too old to be flying safely. Try again.");
            input.nextInt();
        }else {
            a.setAge(setAge);
        }


    }

    public void ticketPrice(Boarding_Pass_Info a){
        int min = 120;
        int max = 1000;
        int ticketPrice = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(a.getAge() <= 12){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Children 12 and under get a 50% discount.");
            ticketPrice -= (ticketPrice * 0.5);
            System.out.println("Ticket Price after discount: $" + ticketPrice);
        }else if(a.getAge() >= 60){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Senior citizens of 60 years or older receive a 60% discount.");
            ticketPrice -= (ticketPrice * 0.6);
            System.out.println("Ticket price after 60% discount: $" + ticketPrice);
        }else if(a.getGender().contains("F")){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Women receive a 25% discount.");
            ticketPrice -= (ticketPrice * 0.25);
            System.out.println("Price after 25% discount: $" + ticketPrice);
        }else{
            System.out.println("Ticket Price is: $" + ticketPrice);
        }
    }
}
