/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ar.tradehelm;

/**
 *
 * @author maria
 */
/*
 Problem 1
 A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 Count the minimal number of jumps that the small frog must perform to reach its target.
 Write a function:
 int solution(int X, int Y, int D); 
 that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 For example, given:
 X = 10
 Y = 85
 D = 30
 the function should return 3, because the frog will be positioned as follows:
 
 after the first jump, at position 10 + 30 = 40
 after the second jump, at position 10 + 30 + 30 = 70
 after the third jump, at position 10 + 30 + 30 + 30 = 100
 */
public class Problem1 {

    public int solution(int initialPosition, int range, int target) {
        int jumps = 0;

        int progress = initialPosition;
        while (progress <= target) {
            jumps++;
            progress = jump(progress, range);
        }
        return jumps;
    }

    private int jump(int position, int distance) {
        int result = position + distance;
        return result;
    }

}
