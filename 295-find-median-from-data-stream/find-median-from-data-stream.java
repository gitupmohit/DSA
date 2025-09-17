class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // left half
    private PriorityQueue<Integer> minHeap; // right half

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        minHeap = new PriorityQueue<>(); // min-heap
    }
    
    public void addNum(int num) {
        // Step 1: Add to maxHeap first
        maxHeap.offer(num);
        
        // Step 2: Balance -> move top of maxHeap to minHeap
        minHeap.offer(maxHeap.poll());
        
        // Step 3: Ensure size property (maxHeap >= minHeap)
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek(); // odd case
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0; // even case
        }
    }
}
