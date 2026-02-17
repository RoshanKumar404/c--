public class problem38 {
   
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String s = "1";
        // Hum 2 se n tak loop chalayenge string build karne ke liye
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++; // Agar same hai toh count badhao
                } else {
                    // Agar badal gaya, toh count aur character likho
                    sb.append(count).append(s.charAt(j - 1));
                    count = 1; // Reset count
                }
            }
            // Last wala character append karne ke liye
            sb.append(count).append(s.charAt(s.length() - 1));
            s = sb.toString(); // Agli iteration ke liye update
        }
        return s;
    }
}
    
