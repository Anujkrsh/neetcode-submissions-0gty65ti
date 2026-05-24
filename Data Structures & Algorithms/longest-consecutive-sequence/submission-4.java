class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, count = 1;
        Arrays.sort(nums);
        for (int n : nums) {
            set.add(n);
        }
        for (int n : set) {
            if (!set.contains(n - 1)) {
                count = 1;
            while (set.contains(n + 1)) {
                count++;
                n++;
            }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}