package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class TestClassLion {

    @Mock
    Feline feline;

    @Test
    public void hasManeIsNull() {
        Throwable exception = assertThrows(
                Exception.class, () -> {
                    Lion lion = new Lion("", feline);
                }
        );
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getFoodReturnPredatorList() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedList);
        Lion lion = new Lion("Самец", feline);
        List<String> actualList = lion.getFood();
        assertEquals("List isn't equal", expectedList, actualList);
    }

    @Test
    public void getKittensArgument0lReturns0() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

}