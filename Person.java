
public class Person {
    String name;
    String location;
    int yearsOfService;
    int age;

    public Person(String name, String location, int age, int yearsOfService) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }

    // setters and getters    dd
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
        this.location = location;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void giveAward() {
        if (yearsOfService >= 10) {
            System.out.println(name + " is presented with the gold award of service after " + yearsOfService
                    + "years of service.");
        } else if (yearsOfService >= 5) {
            System.out.println(name + " is presented with the silver award of service after " + yearsOfService
                    + "years of service.");
        } else if (yearsOfService >= 3) {
            System.out.println(name + " is presented with the bronze award of service after " + yearsOfService
                    + "years of service.");
        } else {
            System.out.println(name + " is presented with the minor award of service after " + yearsOfService
                    + "years of service.");
        }
    }
}