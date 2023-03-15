package rikkei.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("kiểm tra tam giác thường")
    public void testTriangleClassifier(){
       String result =   TriangleClassifier.triangle(2,2,2);
       String expected = "Tam giác đều";
       assertEquals(expected,result);

    }


}