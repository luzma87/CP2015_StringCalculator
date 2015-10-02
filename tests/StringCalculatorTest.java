import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTest {
    @Test
    public void recibeVacioRetornaCero() {
        int test = StringCalculator.add("");

        assertThat(test, is(0));
    }

    @Test
    public void recibeString1retornaInt1(){
        int test = StringCalculator.add("1");
        assertThat(test,is(1));
    }

    @Test
    public void recibeNumeroRandon (){
        int num= (int) (Math.random()*100);
    int test= StringCalculator.add(""+num);
        assertThat(test,is(num));
    }
}