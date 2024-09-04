package src.main;

public class Palindromo {

    String invertedsentence;

    public boolean polindromo(String prayer) {
        invertedsentence = new StringBuilder(prayer).reverse().toString();
        return invertedsentence.equals(prayer);

    }
}
