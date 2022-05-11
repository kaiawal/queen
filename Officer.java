public class Officer extends Person {
    private String post;
    private int accessLevel;
    private int squad;
    private String name;
    private String location;
    private int yearsOfService;
    private int age;

    
    public Officer(String name, String location, int age, int yearsOfService, String post, int squad, int accessLevel) {
        super(name, location, age, yearsOfService);
        post = this.post;
        accessLevel = this.accessLevel;
        squad = this.squad;
        name = this.name;
        location = this.location;
        age = this.age;
        yearsOfService = this.yearsOfService;
    }

    public String getPost() {
        return post;
    }
    public int getaccessLevel() {
        return accessLevel;
    }
    public int getsquad() {
        return squad;
    }
    public void setPost(String post) {
        post = this.post;
    }
    public void setAcessLevel(int accessLevel) {
        accessLevel = this.accessLevel;
    }
    public void setSquad(int squad) {
        squad = this.squad;
    }

    public void giveBreak(int minutes) {
        System.out.println(name + " is taking a " + minutes + " minute break.");
    }
}
