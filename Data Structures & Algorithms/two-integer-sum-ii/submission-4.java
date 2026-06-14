class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[2];

        while (j > i) {
            int fin = numbers[i] + numbers[j];
            if (fin == target) {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            if (fin > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
