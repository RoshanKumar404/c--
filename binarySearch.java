public interface binarySearch {
    public static void main(String[] args) {
        int[]Sortedarray={4,5,23,34,38,50};
        int target=34;
System.out.println(BinarySearch(Sortedarray, target));
}

static int BinarySearch(int[]Sortedarray,int target){
    int Start=0;
    int endpoint=Sortedarray.length-1;
    while (Start<=endpoint) {
        int midElement= Start+(endpoint-Start)/2;
        if (target<Sortedarray[midElement]) {
            endpoint=midElement-1;
        }
        else if(target>Sortedarray[midElement]){
            Start=midElement+1;
        }
        else{
            return midElement;
        }
    }
    return -1;
}
}
