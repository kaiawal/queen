public class Officer extends Person {
    private String post;
    private int accessLevel;
    private int squad;

    public Officer(String name, String location, int age, int yearsOfService, String post, int squad,
            int accessLevel) {
        super(name, location, age, yearsOfService);
        this.post = post;
        this.accessLevel = accessLevel;
        this.squad = squad;
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
        this.post = post;
    }

    public void setAcessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setSquad(int squad) {
        this.squad = squad;
    }

    public void giveBreak(int minutes) {
        System.out.println(name + " is taking a " + minutes + " minute break.");
    }

    public void doPractice() {
        int practice = (int) (Math.random() * 6);
        String[] tools = new String[] { "gun", "sword", "knife", "bow", "lance", "mace" };
        System.out.println(name + " is practicing" + tools[practice]);
    }
}
