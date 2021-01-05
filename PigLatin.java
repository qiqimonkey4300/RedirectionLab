import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pigLatinSimple("mock")); //ockmay
    System.out.println(pigLatinSimple("pie")); //iepay
    System.out.println(pigLatinSimple("david")); //avidday
    System.out.println(pigLatinSimple("aaron")); //aaronhay
    System.out.println();
    System.out.println(pigLatin("the")); //ethay
    System.out.println(pigLatin("check")); //eckchay
    System.out.println(pigLatin("skee")); //eeskay
    System.out.println(pigLatin("emu")); //emuhay
    System.out.println(pigLatin("grade")); //adegray
  }
  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    String vowels = "aeiou";
    if (vowels.contains(s.substring(0,1))) return (s + "hay");
    return (s.substring(1, s.length()) + s.charAt(0) + "ay");
  }
  public static String pigLatin(String s) {
    String[] diagraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length() > 1 && Arrays.asList(diagraphs).contains(s.substring(0,2))) {
      return (s.substring(2,s.length()) + s.substring(0,2) + "ay");
    }
    return pigLatinSimple(s);
  }
  //public static String pigLatinBest(String s) { }
}
