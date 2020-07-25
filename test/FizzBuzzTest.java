import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_RetornaFizz_QuandoMultiploDe3() {
        final String esperado = "Fizz";

        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String resposta = fizzBuzz.fizzBuzz(3);

        assertThat(resposta, CoreMatchers.equalTo(esperado));
    }

    @Test
    public void fizzBuzz_RetornaBuzz_QuandoMultiploDe5() {
        final String esperado = "Buzz";

        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String resposta = fizzBuzz.fizzBuzz(5);

        assertThat(resposta, CoreMatchers.equalTo(esperado));
    }

    @Test
    public void fizzBuzz_RetornaFizzBuzz_QuandoMultiploDe3e5() {
        final String esperado = "FizzBuzz";

        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String resposta = fizzBuzz.fizzBuzz(15);

        assertThat(resposta, CoreMatchers.equalTo(esperado));
    }

    @Test
    public void fizzBuzz_RetornaStringVazia_QuandoNaoMultiploDe3ou5() {
        final String esperado = "";

        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String resposta = fizzBuzz.fizzBuzz(2);

        assertThat(resposta, CoreMatchers.equalTo(esperado));
    }
}