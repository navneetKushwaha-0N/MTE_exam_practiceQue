class MaxXOR {

    static class TrieNode {
        TrieNode[] child = new TrieNode[2]; // 0 and 1
    }

    public static void insert(TrieNode root, int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.child[bit] == null) {
                node.child[bit] = new TrieNode();
            }
            node = node.child[bit];
        }
    }

    public static int findMaxXOR(int[] nums) {
        TrieNode root = new TrieNode();

        // Build Trie
        for (int num : nums) {
            insert(root, num);
        }

        int maxXOR = 0;

        for (int num : nums) {
            TrieNode node = root;
            int currXOR = 0;

            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int oppositeBit = 1 - bit;

                if (node.child[oppositeBit] != null) {
                    currXOR |= (1 << i);
                    node = node.child[oppositeBit];
                } else {
                    node = node.child[bit];
                }
            }

            maxXOR = Math.max(maxXOR, currXOR);
        }

        return maxXOR;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR is: " + findMaxXOR(nums)); // Output: 28
    }
}
