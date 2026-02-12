import java.util.Scanner;

class CharacterPractice {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        // ============================================
        // PART 1: READING A CHARACTER
        // ============================================
        
        // TODO 1: Prompt user to enter a character
        System.out.print("Enter a character: ");
        
        // TODO 2: Read the input as a String using nextLine()
        String userInput = input.nextLine();
        
        // TODO 3: Extract the first character using charAt(0)
        char ch = userInput.charAt(0);
        
        // TODO 4: Print what they entered
        System.out.println("You entered: " + ch);
        
        
        // ============================================
        // PART 2: CHARACTER TESTING
        // ============================================
        
        // TODO 5: Check if ch is a letter using Character.isLetter()
        System.out.println("Is it a letter? " + Character.isLetter(ch));
        
        // TODO 6: Check if ch is a digit using Character.isDigit()
        System.out.println("Is it a digit? " + Character.isDigit(ch));
        
        // TODO 7: Check if ch is uppercase using Character.isUpperCase()
        System.out.println("Is it uppercase? " + Character.isUpperCase(ch));
        
        
        // ============================================
        // PART 3: CASE CONVERSION
        // ============================================
        
        // TODO 8: Convert ch to uppercase and print it
        char upper = Character.toUpperCase(ch);
        System.out.println("Uppercase version: " + upper);
        
        // TODO 9: Convert ch to lowercase and print it
        char lower = Character.toLowerCase(ch);
        System.out.println("Lowercase version: " + lower);
        
        
        // ============================================
        // PART 4: VOWEL CHECK (PREVIEW)
        // ============================================
        
        // TODO 10: Check if ch is a vowel (a, e, i, o, u)
        char lowerCh = Character.toLowerCase(ch);
        
        if (lowerCh == 'a' ||
            lowerCh == 'e' ||
            lowerCh == 'i' ||
            lowerCh == 'o' ||
            lowerCh == 'u') {
            
            System.out.println("It is a vowel!");
        } else {
            System.out.println("It is NOT a vowel.");
        }
        
        
        System.out.println();
        System.out.println("--- Week 5 Lab Complete! ---");
        System.out.println("You're ready for Assignment 4: Vowel or Consonant");
    }
}
