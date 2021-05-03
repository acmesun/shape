package by.lukyanets.shape.parser;

import by.lukyanets.shape.exception.ShapeException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DataParserTest {
    private final DataParser parser = new DataParser();

    @Test
    public void parserDataNormalTest() throws ShapeException {
        List<Double> actual = parser.parseData("8 1 8 2.0 5.7 5.0 -9.0");
        List<Double> expected = Arrays.asList(8.0, 1.0, 8.0, 2.0, 5.7, 5.0, -9.0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void parserDataAllIntTest() throws ShapeException {
        List<Double> actual = parser.parseData("103 2 952 4 8 7 500");
        List<Double> expected = Arrays.asList(103.0, 2.0, 952.0, 4.0, 8.0, 7.0, 500.0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void parserDataWithLettersTest() {
        Assert.assertThrows(ShapeException.class, () -> parser.parseData("103l 2 952q 4 8 7 500"));
    }
}
