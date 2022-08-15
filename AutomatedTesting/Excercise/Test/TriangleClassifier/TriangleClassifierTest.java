package TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void showTriangleIs() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,2);
        String expected = "Tam giac deu";
        String result = triangleClassifier.showTriangleIs();
        assertEquals(expected, result);
    }

    @Test
    void showTriangleIs1() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,3);
        String expected = "Tam giac can";
        String result = triangleClassifier.showTriangleIs();
        assertEquals(expected, result);
    }
    @Test
    void showTriangleIs2() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(3,4,5);
        String expected = "Tam giac thuong";
        String result = triangleClassifier.showTriangleIs();
        assertEquals(expected, result);
    }
    @Test
    void showTriangleIs3() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(8,2,3);
        String expected = "Khong phai tam giac";
        String result = triangleClassifier.showTriangleIs();
        assertEquals(expected, result);
    }
}