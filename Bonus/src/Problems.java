import java.util.ArrayList;
import java.util.List;

public class Problems {
    /*
    You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
    You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
    Return the array ans. Answers within 10-5 of the actual answer will be accepted.

    Note that:
    Kelvin = Celsius + 273.15
    Fahrenheit = Celsius * 1.80 + 32.00

    Example 1:
    Input: celsius = 36.50
    Output: [309.65000,97.70000]
    Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

    Example 2:
    Input: celsius = 122.11
    Output: [395.26000,251.79800]
    Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
     */
    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];

        //Your code goes here
        double kelvinFromCelsius = celsius + 273.15;
        double fahrenheitFromCelsius = celsius * 1.8 + 32;
        answer[0] = kelvinFromCelsius;
        answer[1] = fahrenheitFromCelsius;
        return answer;
    }

    /*
    You are given an integer array daysLate where daysLate[i] indicates how many days late the ith book was returned.
    The penalty is calculated as follows:
    If daysLate[i] == 1, penalty is 1.
    If 2 <= daysLate[i] <= 5, penalty is 2 * daysLate[i].
    If daysLate[i] > 5, penalty is 3 * daysLate[i].

    Return the total penalty for all books.

    Example 1:
    Input: daysLate = [5,1,7]
    Output: 32

    Explanation:
    daysLate[0] = 5: Penalty is 2 * daysLate[0] = 2 * 5 = 10.
    daysLate[1] = 1: Penalty is 1.
    daysLate[2] = 7: Penalty is 3 * daysLate[2] = 3 * 7 = 21.
    Thus, the total penalty is 10 + 1 + 21 = 32.

    Example 2:
    Input: daysLate = [1,1]
    Output: 2

    Explanation:
    daysLate[0] = 1: Penalty is 1.
    daysLate[1] = 1: Penalty is 1.
    Thus, the total penalty is 1 + 1 = 2.
     */
    public static int lateFee(int[] daysLate) {
        int Finalanswer = 0;

        for(int i = 0; i < daysLate.length; i++) {
            int answer;
            if(daysLate[i] == 1) {
                answer = 1;
            }
            else if(daysLate[i] <= 5) {
                answer = 2 * daysLate[i];
            }
            else if(daysLate[i] > 5) {
                answer = 3 * daysLate[i];
            }
            else {
                answer = 0;
            }
            Finalanswer += answer;
        }

        //Your code goes here

        return Finalanswer;
    }

    /*
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.

    Example 1:
    Input: n = 3
    Output: ["1","2","Fizz"]

    Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]

    Example 3:
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     */
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                result.add("Fizz");
            }
            else if(i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(i));
            }}
        /*
        Things you'll need to know:
        Modulus operator (%)
        Logical AND operator (&&)

        Example to add to result list
        result.add("Fizz");
        // To add an integer to a string, use Integer.toString()
        result.add(Integer.toString(5));
         */
        //Your code goes here

        return result;
    }

    /*
    In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
    As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

    Example 1:
    Input: nums = [0,1,1,0]
    Output: [0,1]

    Explanation:
    The numbers 0 and 1 each appear twice in the array.

    Example 2:
    Input: nums = [0,3,2,1,3,2]
    Output: [2,3]

    Explanation:
    The numbers 2 and 3 each appear twice in the array.

    Example 3:
    Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
    Output: [4,5]

    Explanation:
    The numbers 4 and 5 each appear twice in the array.
     */
    public static int[] getSneakyNumbers(int[] nums) {
        int[] answer = new int[2];
        ArrayList<Integer> answers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int number : nums) {
            if(numbers.contains(number)) {
                answers.add(number);
            }
            else {
                numbers.add(number);
            }
        }
        for(int i = 0; i < answers.size(); i++) {
            answer[i] = answers.get(i);
        }
        //Your code goes here

        return answer;
    }

    /*
    You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
    Return the number of times the user had to change the key.

    Note: Modifiers like shift or caps lock won't be counted in changing the key that is if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.

    Example 1:
    Input: s = "aAbBcC"
    Output: 2
    Explanation:
    From s[0] = 'a' to s[1] = 'A', there is no change of key as caps lock or shift is not counted.
    From s[1] = 'A' to s[2] = 'b', there is a change of key.
    From s[2] = 'b' to s[3] = 'B', there is no change of key as caps lock or shift is not counted.
    From s[3] = 'B' to s[4] = 'c', there is a change of key.
    From s[4] = 'c' to s[5] = 'C', there is no change of key as caps lock or shift is not counted.

    Example 2:
    Input: s = "AaAaAaaA"
    Output: 0
    Explanation: There is no change of key since only the letters 'a' and 'A' are pressed which does not require change of key.
     */
    public static int countKeyChanges(String s) {
        int answer = 0;

        /*
        Things you'll need to know:
        To make a new string lowercase or uppercase. Pick one.
        String lower = s.toLowerCase();
        String lower = s.toUpperCase();

        To access an individual character of a string
        lower.charAt(<Position>);
         */
        //Your code goes here

        return answer;
    }

    /*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    Example 1:
    Input: nums = [3,0,1]
    Output: 2

    Explanation:
    n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

    Example 2:
    Input: nums = [0,1]
    Output: 2

    Explanation:
    n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

    Example 3:
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8

    Explanation:
    n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
     */
    public static int missingNumber(int[] nums) {
        int answer = 0;

        //Your code goes here

        return answer;
    }

    /*
    You are given an integer array order of length n and an integer array friends.
        - order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
        - friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
    Return an array containing your friends' IDs in their finishing order.

    Example 1:
    Input: order = [3,1,2,5,4], friends = [1,3,4]
    Output: [3,1,4]

    Explanation:
    The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].

    Example 2:
    Input: order = [1,4,5,3,2], friends = [2,5]
    Output: [5,2]

    Explanation:
    The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of your friends is [5, 2].
     */
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] answer = new int[friends.length];

        //Your code goes here

        return answer;
    }

    /*
    A pangram is a sentence where every letter of the English alphabet appears at least once.
    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

    Example 1:
    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.

    Example 2:
    Input: sentence = "thefoxjumpsoverthedog"
    Output: false
     */
    public static boolean checkIfPangram(String sentence) {
        boolean answer = false;

        /*
        Things you'll need to know:
        To test for any letter, you can use 'a' + number. Example: c == 'a' + 2
        26 letters in the alphabet
         */
        //Your code goes here

        return answer;
    }

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        //Your code goes here

        return answer;
    }

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.

    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        boolean answer = false;

        /*
        Things you'll need to know:
        May be helpful to make the string either upper or lower case.
        To check if a char is a letter, use Character.isAlphabetic(lower.charAt(<position>)
        May be helpful to keep track of multiple positions in the string.
         */
        //Your code goes here

        return answer;
    }

}