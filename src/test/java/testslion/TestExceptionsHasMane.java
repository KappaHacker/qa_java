package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class TestExceptionsHasMane {

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

}