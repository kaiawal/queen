public class Cleaner extends Person {
    private int accessLevel;
    private String duty;

    public Cleaner(String name, String location, int age, int yearsOfService, int accessLevel, String duty) {
        super(name, location, age, yearsOfService);
        this.accessLevel = accessLevel;
        this.duty = duty;
    }

    public int getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Cleaner accessLevel(int accessLevel) {
        setAccessLevel(accessLevel);
        return this;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Cleaner duty(String duty) {
        setDuty(duty);
        return this;
    }

}
