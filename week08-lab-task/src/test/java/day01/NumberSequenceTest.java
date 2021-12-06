package day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void testCreate() {
        NumberSequence numberSequence = new NumberSequence(5, 2, 10);
        assertEquals(5, numberSequence.getNumberList().size());
    }

    @Test
    void testCreateWithList() {
        NumberSequence numberSequence = new NumberSequence(
                new ArrayList<>(Arrays.asList(2, 7, 3, 5, 2)));
        assertEquals(5, numberSequence.getNumberList().size());
    }

    @Test
    void testCloseToAverage() {
        NumberSequence numberSequence = new NumberSequence(
                new ArrayList<>(Arrays.asList(2, 7, 3, 5, 4)));
        List<Integer> momentum = numberSequence.closeToAverage(2);
        assertEquals(3, momentum.size());
    }

}