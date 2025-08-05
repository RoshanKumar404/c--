public class ZigZagConversion {
    public static void main(String[] args) {
        String S = "P";
        int num = 4;
        System.out.println(ZigZag(S, num));
    }

    static String ZigZag(String S, int num) {
        // 1st edge case handled

        if (num == 1 || S.length() <= num)
            return S;
        // char [] SeprateChar= S.toCharArray();
        StringBuilder[] updated = new StringBuilder[num];
        // creating the rows

        for (int i = 0; i < num; i++) {
            updated[i] = new StringBuilder();
        }
        // traversing the string and assigning character to row

        int row = 0;
        boolean DownWards = false;
        for (char c : S.toCharArray()) {
            updated[row].append(c);
            if (row == 0 || row == num - 1) {
                DownWards = !DownWards;

            }
            row += DownWards ? 1 : -1;
        }

        StringBuilder FinalOutput = new StringBuilder();
        for (StringBuilder sb : updated)
            FinalOutput.append(sb);
        return FinalOutput.toString();

    }
}
