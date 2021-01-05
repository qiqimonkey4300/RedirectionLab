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
    System.out.println(pigLatin("eMu")); //emuhay
    System.out.println(pigLatin("grade")); //adegray
    System.out.println();
    System.out.println(pigLatinBest("*emu")); //*emu
    System.out.println(pigLatinBest("4cHan")); //4chan
    System.out.println(pigLatinBest("fish!")); //ishfay!
    System.out.println(pigLatinBest("fish")); //ishfay
    System.out.println(pigLatinBest("the.")); //ethay.
    System.out.println(pigLatinBest("cat!")); //atcay!
    System.out.println(pigLatinBest("amazing?")); //amazinghay?
    System.out.println(pigLatinBest("apple%")); //applehay%

  }

  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    String vowels = "aeiou";
    if (vowels.contains(s.substring(0,1))) return (s + "hay");
    return (s.substring(1, s.length()) + s.charAt(0) + "ay");
  }

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    String[] diagraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length() > 1 && Arrays.asList(diagraphs).contains(s.substring(0,2))) {
      return (s.substring(2,s.length()) + s.substring(0,2) + "ay");
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    if (! Character.isLetter(s.charAt(0))) return s;
    char end = s.charAt(s.length() - 1);
    if (Character.isDigit(end) || Character.isLetter(end)) {
      return pigLatin(s);
    }
    return pigLatin(s.substring(0, s.length() - 1)) + end;
  }
}
