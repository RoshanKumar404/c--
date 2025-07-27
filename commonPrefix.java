class commonPrefix {
    public static void main(String[] args) {
        String[] Str = { "rohit", "rohan", "roman", "ronit" };
        String result = LongestCommonPrefix(Str);
        System.out.println(result);
    }

    public static String LongestCommonPrefix(String[] Str) {
        if (Str==null||Str.length==0) return "" ;
        String prefix = Str[0];
        for (int i = 1; i < Str.length; i++) {
            while (!(Str[i].startsWith(prefix))) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
                // Str[i].substring(0,Str[i].length()-1)
            }
        }

        return prefix;
    }
}