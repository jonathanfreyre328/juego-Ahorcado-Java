import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
      

        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "ahorcado";
        int intentosPosibles = 6;
        int intentos = 0;
        Boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosPosibles) {
            
            System.out.println("La palabra a adivinar es: "+ String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            } 
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorreta, te quedan "+ (intentosPosibles - intentos) + " intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta) ) {
                palabraAdivinada = true;
                System.out.println("Correcto, la palabra era: " + palabraSecreta);
            }

        }
        if (!palabraAdivinada) {
            System.out.println("Mala suerte, te quedaste sin intentos");
        }
        scanner.close();
    }
}
