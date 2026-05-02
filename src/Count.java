public class Count {
    private int counting = 0;

    public void countingZeroToLimit(int limit){
        if(counting > limit){
            return;
        }
        System.out.println(counting+++"!");
        countingZeroToLimit(limit);
    }
}
