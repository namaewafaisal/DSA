public class Digits {
    public static void main(String[] args) {
        int number = 12345;
        int count = (int) Math.log10(number) + 1;
        System.out.println(count);
    }

}