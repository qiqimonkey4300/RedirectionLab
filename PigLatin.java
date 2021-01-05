import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pigLatinSimple("mock")); //ockmay
    System.out.println(pigLatinSimple("pie")); //iepay
    System.out.println(pigLatinSimple("david")); //avidday
    System.out.println(pigLatinSimple("aaron")); //aaronhay
  }
  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    String vowels = "aeiou";
    if (vowels.contains(s.substring(0,1))) return (s + "hay");
    return (s.substring(1, s.length()) + s.charAt(0) + "ay");
  }
  //public static String pigLatin(String s) { }
  //public static String pigLatinBest(String s) { }
}
