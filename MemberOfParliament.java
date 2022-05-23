
public class MemberOfParliament extends Person {
    private String duty;
    private Boolean isChairman;

    public MemberOfParliament(String name, String location, int age, int yearsOfService, String duty,
            Boolean isChairman) {
        super(name, location, age, yearsOfService);
        this.duty = duty;
        this.isChairman = isChairman;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Boolean isIsChairman() {
        return this.isChairman;
    }

    public Boolean getIsChairman() {
        return this.isChairman;
    }

    public void setIsChairman(Boolean isChairman) {
        this.isChairman = isChairman;
    }

    public void callMeeting() {
        if (isChairman == true) {
            System.out.println("A meeting has been called.");
        }
    }

}