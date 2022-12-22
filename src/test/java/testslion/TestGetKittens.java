package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestGetKittens {

    @Mock
    Feline predator;

    @Test
    public void getKittensArgument0lReturns0() throws Exception {
        Lion lion = new Lion("Самец", predator);
        Mockito.when(predator.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
}