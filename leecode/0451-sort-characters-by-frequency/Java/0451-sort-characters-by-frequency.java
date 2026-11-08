class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequencies using negative values
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i),
                freq.getOrDefault(s.charAt(i), 0) - 1);
        }

        // Convert HashMap entries into a List
        List<Map.Entry<Character, Integer>> list =
            new ArrayList<>(freq.entrySet());

        // Sort negative frequencies in ascending order
        list.sort(Map.Entry.comparingByValue());

        // Build result
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int count = -entry.getValue();

            ans.append(String.valueOf(c).repeat(count));
        }

        return ans.toString();
    }
}