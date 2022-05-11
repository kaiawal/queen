import java.util.ArrayList;

public class Person {
    private String name;
    private String location;
    private int yearsOfService;
    private int age;
    private ArrayList<Person> people = new ArrayList<Person>();

    public Person(String name, String location, int age, int yearsOfService) {
        name = this.name;
        location = this.location;
        age = this.age;
        yearsOfService = this.yearsOfService;
    }


    // setters and getters
    public String getName() {
        return name;
    }
    public String getlocation() {
        return location;
    }
    public int getYearsOfService() {
        return yearsOfService;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        name = this.name;
    }
    public void setLocation(String location) {
        location = this.location;
    }
    public void setYearsOfService(int yearsOfService) {
        yearsOfService = this.yearsOfService;
    }
    public void setAge(int age) {
        age = this.age;
    }

    public void callMeeting() {
        for (Person n: people) {
            n.setLocation("Throne Room");
        }
    }

    public void giveAward() {
        if (yearsOfService >= 10) {
            System.out.println(name + " is presented with the gold award of service after " + yearsOfService + "years of service.");
        }
        else if (yearsOfService >=5) {
            System.out.println(name + " is presented with the silver award of service after " + yearsOfService + "years of service.");
        }
        else if (yearsOfService >=3) {
            System.out.println(name + " is presented with the bronze award of service after " + yearsOfService + "years of service.");
        }
        else {
            System.out.println(name + " is presented with the minor award of service after " + yearsOfService + "years of service.");
        }
    }
}