package src.main;

public class Main {
    public static void main(String[] args) {

    Palindromo p = new Palindromo();

    String opacion = "ana";
        if (p.polindromo(opacion)){

            System.out.println("polindromo"+":  " + opacion);
        }else{
                System.out.println("No es un polindromo"+":  " + opacion);
        }
    }
}