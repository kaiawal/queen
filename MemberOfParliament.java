public class MemberOfParliament extends Person {
private String duty;
private Boolean isChairman;

    public MemberOfParliament(String name, String location, int age, int yearsOfService, String duty, Boolean isChairman) {
        super(name, location, age, yearsOfService);
        duty = this.duty;
        isChairman = this.isChairman;
    }
}