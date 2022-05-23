public class Queen {
    public static void main(String[] args) {

        Officer officer1 = new Officer("Jack", "dining hall", 31, 7, "hall", 2, 4);
        officer1.giveBreak(20);
        Cleaner cleaner1 = new Cleaner("mary", "hallway", 41, 20, 4, "sweep hallways");
        cleaner1.giveAward();
        officer1.setAcessLevel(3);
    }
}
