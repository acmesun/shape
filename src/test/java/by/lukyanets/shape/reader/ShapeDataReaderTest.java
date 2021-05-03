package by.lukyanets.shape.reader;

import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.util.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeDataReaderTest {
    private final ShapeDataReader reader = new ShapeDataReader();

    @Test
    public void readFromFileTest() throws ShapeException {
        List<String> actual = reader.readFromFile(Util.findAbsolutePath("test.txt"));
        List<String> expected = new ArrayList<>();
        expected.add("2.8 2.9 2.5 4.0");
        expected.add("2.0 5.7 5.0 -9.0");
        expected.add("8.7 1.3 5a 8");
        expected.add("14.8 5.3 4.9 1.0");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void readFromFileEmptyTest() throws ShapeException {
        List<String> actual = reader.readFromFile(Util.findAbsolutePath("empty.txt"));
        List<String> expected = new ArrayList<>();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void readFromFileNoSuchFileTest() {
        Assert.assertThrows(NullPointerException.class, () -> reader.readFromFile(Util.findAbsolutePath("noSuchFile.txt")));
    }

}
