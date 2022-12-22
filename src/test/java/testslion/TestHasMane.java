package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestHasMane {
    @Parameterized.Parameter(0)
    public String sex;

    @Parameterized.Parameter(1)
    public boolean expectedHasMane;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "sex : {0}, hasMane : {1}")
    public static Object[][] parameters() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void doesHaveManeReturnTrue() throws Exception {

        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("Пол не совпадает", expectedHasMane, actualHasMane);
    }
}