import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String sentence = "Think Twice";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        System.out.println("Reversed sentence: " + sb.toString());
    }
}
