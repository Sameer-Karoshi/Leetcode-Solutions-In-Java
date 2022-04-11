class Solution {
    public double angleClock(int hour, int minutes) {
       //Hour hand roatation per hour = 360/12 = 30
		// Hour hand rotation per min = 30/60 = 0.5
		// Min hand rotation per min = 360/60 = 6
        double diff = Math.abs((hour%12)*30 + minutes*0.5- minutes*6);
        return diff>180? (360-diff):diff; 
    }
}
