package password.generator;

import java.util.Random;

/**
 * A little program to generate a password similar in format to temporary 
 * passwords used in Office 365. The password format is:
 * Character 1 - uppercase consonant
 * Character 2 - lowercase vowel
 * Character 3 - lowercase consonant
 * Character 4 - lowercase vowel
 * Characters 5 to 8 - random digits
 * 
 * @author Rafal Rozmus <rozmus.rafal@gmail.com>
 */
public class Office365LikePasswordGenerator {
    
    private final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};
    private final char[] CONSONANTS = {'b', 'c', 'd', 'f', 'g', 
                                       'h', 'j', 'k', 'l', 'm', 
                                       'n', 'p', 'q', 'r', 's', 
                                       't', 'v', 'w', 'x', 'z'};
    private StringBuilder password;
    
    public static void main(String[] args) {
        Office365LikePasswordGenerator generator = new Office365LikePasswordGenerator();
        System.out.println(generator.generatePassword());
    }
    
    public String generatePassword() {
        password = new StringBuilder();
        password.append(Character.toUpperCase(CONSONANTS[new Random().nextInt(VOWELS.length)]));
        password.append(VOWELS[new Random().nextInt(VOWELS.length)]);
        password.append(CONSONANTS[new Random().nextInt(CONSONANTS.length)]);
        password.append(VOWELS[new Random().nextInt(VOWELS.length)]);
        password.append(new Random().nextInt(9));
        password.append(new Random().nextInt(9));
        password.append(new Random().nextInt(9));
        password.append(new Random().nextInt(9));
        return password.toString();
    }
}
