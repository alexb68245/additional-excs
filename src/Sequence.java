//Write an application that takes 10 numbers from the user (type int) and write the length
//of the longest such subsequence of these numbers, which is increasing.
//For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
//as the length of the longest increasing subsequence (underlined in the example).

public class Sequence {

    public static int longestSequence(int[] sequence){
        int[] lis = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            lis[i] = 0;
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j] && lis[i] < lis[j] + 1) {
                    lis[i]++;
                }
            }
        }

        int maxLength = 0;
        for (int length : lis) {
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
