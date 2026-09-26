class Solution {
   public int largestRectangleArea(int[] heights) {
        Stack<Pair> deque = new Stack<>();
        int maxH = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentElement = heights[i];
            int start = i;
            while (!deque.isEmpty() && currentElement < deque.getLast().h) {
                Pair currentTop = deque.pop();
                maxH = Math.max(maxH, currentTop.h * (i - currentTop.idx));
                start = currentTop.idx;
            }
            deque.add(new Pair(start, heights[i]));
        }
        int i = deque.size();
        for (Pair p : deque) {
            maxH = Math.max(maxH, p.h * (heights.length - p.idx));
        }
        return maxH;
    }

    class Pair {
        int idx;
        int h;

        public Pair(int idx, int h) {
            this.idx = idx;
            this.h = h;
        }
    }
}
