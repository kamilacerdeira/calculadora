import calculadora.TestCalculadora;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCalculadora.class})
public class TesteSuite {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(TesteSuite.class);
    }
}
