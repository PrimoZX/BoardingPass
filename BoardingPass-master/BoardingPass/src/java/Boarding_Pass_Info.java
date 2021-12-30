
public class Boarding_Pass_Info {

    //Boarding pass info provided by the user.
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String date;
    private String origin;
    private String destination;
    private String departureTime;
    private int boardingPassNumber;
    private int age;


    //NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    //EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    //Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //GENDER
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    //AGE
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //DEPARTURE DATE
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    //ORIGIN
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }


    //DESTINATION
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }


    //DEPARTURE TIME
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    //BOARDING PASS NUMBER
    public int getBoardingPassNumber() {
        return boardingPassNumber;
    }
    public void setBoardingPassNumber(int boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    @Override
    public String toString() {
        return "Boarding_Pass_Info{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", boardingPassNumber='" + boardingPassNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
