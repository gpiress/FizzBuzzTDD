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
}
