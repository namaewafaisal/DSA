import java.util.TreeSet;

public class Digits {
    public static void main(String[] args) {
        int N = 36;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(N); i++){
            if(N%i==0){
                set.add(i);
            }
            if(N/i != i){
                set.add(N/i);
            }	
        }
        System.out.println(set);
    }

}