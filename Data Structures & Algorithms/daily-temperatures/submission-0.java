class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<pair> pairs = new Stack<>();
        int[] res = new int[temperatures.length];
        Arrays.fill(res, 0);
        for (int i = 0; i < temperatures.length; i++) {
            while (!pairs.isEmpty() && temperatures[i] > pairs.peek().t1) {
                pair p = pairs.pop();
                res[p.t2] = i - p.t2;
            }
            pairs.add(new pair(temperatures[i], i));
        }
        return res;
    }

    static class pair {
        int t1;
        int t2;

        public pair(int t1, int t2) {
            this.t1 = t1;
            this.t2 = t2;
        }
    }
}
