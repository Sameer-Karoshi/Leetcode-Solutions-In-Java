class Solution {
    public int scheduleCourse(int[][] courses) {
    //created maxheap for removing max duration course
    //sort the array by end date
	var maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
	Arrays.sort(courses, Comparator.comparingInt(course -> course[1]));
    int total = 0;
	for (int i = 0; i < courses.length; i++) {
		maxHeap.add(courses[i][0]);
		if ((total += courses[i][0]) > courses[i][1])
			total = total - maxHeap.poll();
	}
	return maxHeap.size();
    }
}
