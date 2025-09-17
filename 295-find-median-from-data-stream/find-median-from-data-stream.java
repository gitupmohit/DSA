class MedianFinder {
    // Max-heap for smaller half
    PriorityQueue<Integer> small;
    // Min-heap for larger half
    PriorityQueue<Integer> large;

    public MedianFinder() {
        small = new PriorityQueue<>((a, b) -> b - a); // max-heap
        large = new PriorityQueue<>(); // min-heap
    }
    
    public void addNum(int num) {
        // Step 1: add to max-heap
        small.offer(num);

        // Step 2: balance heaps so that every num in small <= every num in large
        large.offer(small.poll());

        // Step 3: keep size property (small can have 1 more than large)
        if (small.size() < large.size()) {
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek(); // odd case
        }
        return (small.peek() + large.peek()) / 2.0; // even case
    }
}
