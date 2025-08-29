import java.lang.Math;
public class GCD { 
  public static void main(String[] args) {
    int a = 898;
    int b = 3280;
    int N = a, M = b;
    // int min = Math.min(N,M);
    // for (int i = min; i>=1; i--){
    //   if(N%i==0 && M%i==0){
    //     System.out.println("GCD is " + i);
    //     break;
    //   }
    // }
    while (a > 0 && b > 0) {
      if (a>=b) {
        a=a%b;
      }
      else{
        b=b%a;
      }
    }
    System.out.printf("GCD of %d and %d is %d%n",N,M,Math.max(a, b));
   } 
}
