class Solution {
    Set Seen;

    public Solution() {
        Seen = new HashSet();
    }

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = Seen.add(nums[i]);
            if (!isUnique) {
                return true;
            }
        }

        return false;
    }
}