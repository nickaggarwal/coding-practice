package com.company;

import java.util.Stack;

public class NextGE {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        int arr[] = {20, 5, 7, 6, 9, 4, 10} ;
        printNGE(arr);

    }

    static void printNGE(int[] arr)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);

        int element , next ;
        for( int i =1; i < arr.length ; i++ )
        {
            next = arr[i] ;

            if (!stack.empty())
            {
                element = stack.pop();

                while (element < next)
                {
                    System.out.println(element +" -> " + next);
                    if (stack.empty())
                        break;
                    element = stack.pop();
                }

                if(element > next)
                    stack.push(element);
            }

            stack.push(next);
        }

        while (!stack.empty())
        {
            element = stack.pop();
            System.out.println(element +" -> -1");
        }
    }


}
