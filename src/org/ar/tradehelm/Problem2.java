/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ar.tradehelm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maria
 *
 * ​Problem 2 A zero-indexed array A consisting of N different integers is
 * given. The array contains integers in the range [1..(N + 1)], which means
 * that exactly one element is missing. Your goal is to find that missing
 * element. Write a function: int solution(int A[], int N); that, given a
 * zero-indexed array A, returns the value of the missing element. For example,
 * given array A such that: A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the function
 * should return 4, as it is the missing element. Assume that: N is an integer
 * within the range [0..100,000]; the elements of A are all distinct; each
 * element of array A is an integer within the range [1..(N + 1)].
 */
public class Problem2 {

    private int size;
    private int[] zeroIndex;
    private ArrayList<Integer> range;

    public Problem2(int size) {
        this.size = size;
        this.range = new ArrayList<>();
        this.zeroIndex = toZeroIndex();
    }

    /*
     hago un arraylist y le quito un elemento
     */
    private ArrayList<Integer> range() {

        for (int i = 1; i <= size + 1; i++) {
            range.add(i);
        }
        //remover
        range.remove(new Random().nextInt(size + 1));

        return range;
    }

    /*
     paso el contenido del arraylist al [] index-zero
     */
    private int[] toZeroIndex() {

        ArrayList<Integer> elements = range();
        zeroIndex = new int[elements.size()];

        for (int i = 0; i < zeroIndex.length; i++) {
            zeroIndex[i] = elements.get(i);
        }

        return zeroIndex;
    }

    /*
     Reconvierto el [] a array
     */
    private ArrayList<Integer> indexZeroToArray(int[] a) {

        ArrayList<Integer> elements = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            elements.add(a[i]);
        }
        return elements;
    }

    public int solution(int[] a, int size) {

        int ret = 0;

        ArrayList<Integer> elements = indexZeroToArray(a);

        for (int i = 1; i <= size + 1; i++) {

            if (elements.indexOf(i) == -1) {

                ret = i;

                break;
            }
        }
        return ret;
    }

    public int[] getZeroIndex() {

        return zeroIndex;
    }

    public String toString() {
        return Arrays.toString(zeroIndex);
    }
}
