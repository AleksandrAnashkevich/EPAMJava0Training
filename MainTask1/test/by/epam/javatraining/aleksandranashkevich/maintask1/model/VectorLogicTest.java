package by.epam.javatraining.aleksandranashkevich.maintask1.model;

import org.junit.Assert;
import org.junit.Test;

public class VectorLogicTest {

    @Test
    public void add() {
        double[] vector = {1};
        double[] expected = {1, 2};

        Assert.assertArrayEquals(VectorLogic.add(vector, 2.0), expected, 0.01);
    }

    @Test
    public void findMin() {
        double[] vector = {1.0, 2.0, 3.0};
        double expected = 1.0;

        Assert.assertEquals(VectorLogic.findMin(vector), expected, 0.01);
    }

    @Test
    public void findMax() {
        double[] vector = {1.0, 2.0, 3.0};
        double expected = 3.0;

        Assert.assertEquals(VectorLogic.findMax(vector), expected, 0.01);

    }

    @Test
    public void findArithmeticalMean() {
        double[] vector = {4.0, 2.0, 6.0};
        double expected = 4.0;

        Assert.assertEquals(VectorLogic.findArithmeticalMean(vector), expected, 0.01);
    }

    @Test
    public void findGeometricMean() {
        double[] vector = {4.0, 9.0, 6.0};
        double expected = 6.0;

        Assert.assertEquals(VectorLogic.findGeometricMean(vector), expected, 0.01);
    }

    @Test
    public void checkSequenceTrue() {
        double[] vector = {1.0, 2.0, 3.0};
        boolean expected = true;

        Assert.assertEquals(VectorLogic.checkSequence(vector), expected);
    }

    @Test
    public void checkSequenceFalse() {
        double[] vector = {1.0, 3.0, 2.0};
        boolean expected = false;

        Assert.assertEquals(VectorLogic.checkSequence(vector), expected);
    }

    @Test
    public void toSearchLinearn() {
        double[] vector = {1.0, 2.0, 3.0};
        int expected = 1;

        Assert.assertEquals(VectorLogic.toSearchLinearn(vector, 2.0), expected, 0.01);
    }

    @Test
    public void toSearchLinearnNot() {
        double[] vector = {1.0, 2.0, 3.0};
        int expected = -1;

        Assert.assertEquals(VectorLogic.toSearchLinearn(vector, 4.0), expected, 0.01);
    }

    @Test
    public void toSearchBinary() {
        double[] vector = {1.0, 2.0, 3.0};
        int expected = 1;

        Assert.assertEquals(VectorLogic.toSearchBinary(vector, 2.0), expected, 0.01);
    }

    @Test
    public void toSearchBinaryNot() {
        double[] vector = {1.0, 2.0, 3.0};
        int expected = -1;

        Assert.assertEquals(VectorLogic.toSearchLinearn(vector, 4.0), expected, 0.01);
    }

    @Test
    public void toRevers() {
        double[] vector = {1.0, 3.0, 2.0};
        double[] expected = {2.0, 3.0, 1.0};

        Assert.assertArrayEquals(VectorLogic.toRevers(vector), expected, 0.01);

    }

    @Test
    public void findLocalMax() {
        double[] vector = {1.0, 3.0, 2.0};
        double expected = 3.0;

        Assert.assertEquals(VectorLogic.findLocalMax(vector), expected, 0.01);
    }

    @Test
    public void findLocalMaxNot() {
        double[] vector = {1.0, 2.0, 3.0};
        double expected = -1.0;

        Assert.assertEquals(VectorLogic.findLocalMax(vector), expected, 0.01);
    }

    @Test
    public void findLocalMin() {
        double[] vector = {3.0, 1.0, 2.0};
        double expected = 1.0;

        Assert.assertEquals(VectorLogic.findLocalMin(vector), expected, 0.01);
    }

    @Test
    public void findLocalMinNot() {
        double[] vector = {1.0, 2.0, 3.0};
        double expected = -1.0;

        Assert.assertEquals(VectorLogic.findLocalMin(vector), expected, 0.01);
    }


    @Test
    public void toSortBubble() {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 5.0, 10.0, 10.0};

        Assert.assertArrayEquals(VectorLogic.toSortBubble(vector), expected, 0.01);
    }

    @Test
    public void toSortSelection() {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 5.0, 10.0, 10.0};

        Assert.assertArrayEquals(VectorLogic.toSortSelection(vector), expected, 0.01);
    }

    @Test
    public void toSortMerge() {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 5.0, 10.0, 10.0};

        Assert.assertArrayEquals(VectorLogic.toSortMerge(vector), expected, 0.01);
    }

    @Test
    public void toSortInsertion() {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 5.0, 10.0, 10.0};

        Assert.assertArrayEquals(VectorLogic.toSortInsertion(vector), expected, 0.01);
    }

    @Test
    public void toSortQuick() {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 5.0, 10.0, 10.0};

        Assert.assertArrayEquals(VectorLogic.toSortQuick(vector,0,vector.length-1), expected, 0.01);
    }
}
