public class SingletonTest {
    public static void main(String[] args) {
        Renban renbanA = Renban.getinstance();
        Renban renbanB = Renban.getinstance();
        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
    }
}
class Renban{
    private static Renban renban = new Renban();
    int number;
    private Renban() {
        number = 1;
    }
    public static Renban getinstance() {
        return renban;
    }
    public String getNumber() {
        String str = String.format("%04d",number);
        number++;
        return str;
    }
}