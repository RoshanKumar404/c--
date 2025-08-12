public class PushPillars838 {
    public static void main(String[] args) {
        String dominoes = ".L.R...LR..L..";
        System.out.println(PushPillars(dominoes));

    }

    static String PushPillars(String dominoes) {
        int n = dominoes.length();
        int force = 0;
        int[] RightPushingDominoes = new int[n];
        int[] LeftPushingDominoes = new int[n];

        for (int i = 0; i < n; i++) {
            char ch = dominoes.charAt(i);
            if (ch == 'R') {
                force = n;
            } else if (ch == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            RightPushingDominoes[i] = force;

        }
        for (int i = n - 1; i >= 0; i--) {
            char ch = dominoes.charAt(i);
            if (ch == 'L') {
                force = n;
            } else if (ch == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            LeftPushingDominoes[i] = force;

        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (RightPushingDominoes[i] > LeftPushingDominoes[i]) {
                result.append('R');

            } else if (LeftPushingDominoes[i] > RightPushingDominoes[i]) {
                result.append('L');

            } else {
                result.append('.');
            }

        }
        
        return result.toString();

    }
}
