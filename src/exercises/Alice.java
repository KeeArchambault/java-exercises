package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String alice;
        String term;
        boolean isIn;
        Scanner in;

        alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        in = new Scanner(System.in);
        System.out.println("Search term: ");
        term = in.nextLine();

        isIn = alice.contains(term);

        if (isIn) {
            System.out.println("Term found.");
        } else {
            System.out.println("Term not found.");
        }


    }
}
