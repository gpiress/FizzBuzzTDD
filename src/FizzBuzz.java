public class FizzBuzz {

    public String fizzBuzz(final int numero) {
        String resultado = "";

        if (numero % 3 == 0) {
            resultado += "Fizz";
        }

        if (numero % 5 == 0) {
            resultado += "Buzz";
        }

        return resultado;
    }

    public void imprimirAte(final int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
}
