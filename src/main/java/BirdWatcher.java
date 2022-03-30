
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        int result=0;
        if(birdsPerDay.length>0) result=birdsPerDay[birdsPerDay.length-1];
        return result;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
        // throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        boolean result=false;
        for(int i:birdsPerDay){
            if(i==0) result=true;
        }return result;
        // throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        if(numberOfDays>birdsPerDay.length){
            for(int i=0;i<birdsPerDay.length;i++){
                sum+=birdsPerDay[i];
            }
        }
        else{
            for(int i=0;i<numberOfDays;i++){
                sum+=birdsPerDay[i];
            }
        }
        return sum;
        // throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int result=0;
        for(int i:birdsPerDay){
            if(i>=5) result+=1;
        }return result;
        // throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
