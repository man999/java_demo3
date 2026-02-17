import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

void main(String[] args) {
  //
  int[] freq = new int[26];
  char inputChar[];
  Scanner scanner = new Scanner(System.in);
  System.out.println("press q for exit");
  //get and analysing input
  while (true) {
    String input = scanner.nextLine();
    if (input.equals("q")) break;
    Arrays.fill(freq, 0);
    inputChar = input.toUpperCase(Locale.ROOT).toCharArray();
//    System.out.println(input);
//    System.out.println(inputChar);
    for (char ch : inputChar) {
      int dec = (int) ch - 65;
      if (dec > 0 && dec < 27) freq[ch - 65]++;
    }
    //display result
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] == 0) continue;
      System.out.printf("%s:%d\t", (char) (i + 65), freq[i]);
    }
    System.out.println("");
  }
}