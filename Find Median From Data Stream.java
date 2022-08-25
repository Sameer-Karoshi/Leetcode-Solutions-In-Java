import java.util.*; 
class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<>();
    }
    public void addNum(int num) {
        boolean added = false;
        for(int i = 0;i < list.size();i++){
            if(num <= list.get(i)){
                added = true;
                list.add(i,num);
                break;
            }
        }
        if(!added){
            list.add(num);
        }
    }
    public double findMedian() {
        //System.out.println(list);
        if (list.size()%2 == 0){
           return (double)(list.get(list.size()/2) + list.get((list.size()/2)-1))/2.0;
        }
        return (double)list.get(list.size()/2);
    }
}
