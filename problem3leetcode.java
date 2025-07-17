public class problem3leetcode {
    public static void main(String[] args) {
        String name= "heyBuddy";
        //int Foundlength=length(name);
        System.out.println(length(name));

    }
    static int length(String name){
    int lenghtOfString=name.length();
    int maxLen=0;
    int minLen=0;
    for (int end = 0; end < lenghtOfString; end++) {
        for (int k = minLen; k < end; k++) {
            if (name.charAt(k)==name.charAt(end)) {
                minLen=k+1;
                break;
            }
        }
        maxLen=Math.max(maxLen, end-minLen+1);

        
    }
    return maxLen;
}
}