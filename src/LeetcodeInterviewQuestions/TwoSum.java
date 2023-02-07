package LeetcodeInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  HashTable approach for the two sum  From Leet code !
 *  So that we can ge the good amount of the work done !
 *  Time Complexity O(n)
 *  Space Complexity O(n)
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[]result  = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i < nums.length ;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target Value");
        int target = scanner.nextInt();
        System.out.println("Enter nums of elements of array");
        int n = scanner.nextInt();
        int nums [] = new int[n];
        for (int i = 0 ;i < n ; i++){
            System.out.println("Enter elements of the array ");
            nums[i] = scanner.nextInt();
        }

        int indices[] = twoSum(nums,target);
        if(indices.length == 2)
            System.out.println(indices[0]+" "+indices[1]);
        else
            System.out.println("No target match found !");


    }
}
