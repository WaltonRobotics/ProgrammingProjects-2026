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
     */
    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];

        answer[0] = celsius + 273.15;
        answer[1] = celsius * 1.80 + 32.00;

        return answer;
    }

    /*
    You are given an integer array daysLate where daysLate[i] indicates how many days late the ith book was returned.
    The penalty is calculated as follows:
    If daysLate[i] == 1, penalty is 1.
    If 2 <= daysLate[i] <= 5, penalty is 2 * daysLate[i].
    If daysLate[i] > 5, penalty is 3 * daysLate[i].

    Return the total penalty for all books.
     */
    public static int lateFee(int[] daysLate) {
        int answer = 0;

        for (int days : daysLate) {
            if (days == 1) {
                answer += 1;
            } else if (days >= 2 && days <= 5) {
                answer += 2 * days;
            } else if (days > 5) {
                answer += 3 * days;
            }
        }

        return answer;
    }

    /*
    Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
     */
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    /*
    Find the two numbers that appear twice in the array.
     */
    public static int[] getSneakyNumbers(int[] nums) {
        int[] answer = new int[2];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    answer[count] = nums[i];
                    count++;
                    break;
                }
            }
        }

        return answer;
    }

    /*
    Return the number of times the user changed keys.
    Uppercase and lowercase versions of the same letter count as the same key.
     */
    public static int countKeyChanges(String s) {
        int answer = 0;

        String lower = s.toLowerCase();

        for (int i = 1; i < lower.length(); i++) {
            if (lower.charAt(i) != lower.charAt(i - 1)) {
                answer++;
            }
        }

        return answer;
    }

    /*
    Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing.
     */
    public static int missingNumber(int[] nums) {
        int answer = 0;

        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    /*
    Return your friends' IDs in their finishing order.
     */
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] answer = new int[friends.length];
        int count = 0;

        for (int racer : order) {
            for (int friend : friends) {
                if (racer == friend) {
                    answer[count] = racer;
                    count++;
                    break;
                }
            }
        }

        return answer;
    }

    /*
    Return true if sentence contains every letter of the alphabet.
     */
    public static boolean checkIfPangram(String sentence) {
        boolean answer = true;

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (sentence.indexOf(letter) == -1) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    /*
    Return indices of the two numbers that add up to target.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return answer;
    }

    /*
    Return true if the string is a palindrome after removing
    non-alphanumeric characters and ignoring capitalization.
     */
    public static boolean isPalindrome(String s) {
        boolean answer = true;

        String lower = s.toLowerCase();
        String cleaned = "";

        for (int i = 0; i < lower.length(); i++) {
            char current = lower.charAt(i);

            if (Character.isAlphabetic(current) || Character.isDigit(current)) {
                cleaned += current;
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                answer = false;
                break;
            }

            left++;
            right--;
        }

        return answer;
    }

    @Override
    public String toString() {
        return "Problems []";
    }
}