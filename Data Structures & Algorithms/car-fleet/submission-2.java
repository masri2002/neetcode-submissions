class Solution {
     public int carFleet(int target, int[] position, int[] speed) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            pairs.add(new Pair(position[i], speed[i]));
        }
        pairs.sort((a, b) -> b.pos - a.pos);
        Deque<Double> doubles = new ArrayDeque<>();
        for (Pair p : pairs) {
            double time = ((double) (target - p.pos) / p.speed);
            if (!doubles.isEmpty() && time <= doubles.getLast()) {
            }else{
            doubles.add(time);
            }
        }
        return doubles.size();
    }

    class Pair {
        int pos;
        int speed;

        public Pair(int pos, int speed) {
            this.pos = pos;
            this.speed = speed;
        }
    }
}
