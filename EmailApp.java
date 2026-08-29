// package emailApp;

public class EmailApp{
    public static void main(String[] args){
        Email em1 = new Email("Elyse", "Joyeux");

        em1.setAlternateEmail("elysejoyeux@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }
}