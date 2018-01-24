package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkArray1() {
        int[] a = {0, 1, 7, 3, 5, 6, 2};
        int result = solution.solution(a);
        assertTrue(4 == result);
    }

//    @Test
//    void checkArray2() {
//        int[] a = {3};
//        int result = solution.solution(a);
//        assertTrue(3 == result);
//    }

}