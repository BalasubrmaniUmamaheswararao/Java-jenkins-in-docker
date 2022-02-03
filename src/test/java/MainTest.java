import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkIfInputIsAnEvenNumber() {
        Main main=new Main();
       boolean b= Main.checkIfInputIsAnEvenNumber(22);
        assertTrue(b);
    }
}