public class Lcs {
    static String lcs(String a, String b) {
        if (a.equals("") || b.equals(""))
            return "";

        int[][] orderedLscTable = traceFoward(a, b);
        String lcs = traceBack(orderedLscTable, a, b);

        return lcs;
    }
    static int[][] traceFoward(String a, String b) {
        int[][] lcsTable = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i < a.length() + 1; i++) {
            for (int j = 1; j < b.length() + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
                } else {
                    lcsTable[i][j] = Math.max(lcsTable[i - 1][j], lcsTable[i][j - 1]);
                }
            }
        }
        return lcsTable;
    }
    static String traceBack(int[][] arr, String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length();
        int j = b.length();
        while (arr[i][j] > 0) {
            if (arr[i - 1][j] < arr[i][j] && arr[i][j - 1] < arr[i][j]) {
                result.insert(0, a.charAt(i - 1));
                i--;
                j--;
                continue;
            }
            if (arr[i - 1][j] < arr[i][j]) {
                j--;
            } else {
                i--;
            }
        }
        return result.toString();
    }
}
