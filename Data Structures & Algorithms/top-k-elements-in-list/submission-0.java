

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] uniqueNums = Arrays.stream(nums)
                                 .distinct()
                                 .toArray();

        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        return Arrays.stream(uniqueNums)
                     .boxed()
                     .sorted((a, b) ->
                         Integer.compare(count.get(b), count.get(a)))
                     .limit(k)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}