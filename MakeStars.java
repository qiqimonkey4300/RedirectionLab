import java.util.*;
public class MakeStars {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      String l = n.nextLine();
      Scanner scanl = new Scanner(l);
      while (scanl.hasNext()) {
        String s = scanl.next();
        for (int i = 0; i < s.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      if (n.hasNextLine()) System.out.println();
    }
  }
}
