public class q136 {
    public static void main(String[] args) {
        System.out.println(countUniqueSolutions(50_000_000));
    }

    public static int countUniqueSolutions(int limit) {
        int[] solutionCounts = new int[limit];  

        for (int d = 1; 5 * d * d < limit; d++) {
            for (int x = d + 1; 6 * x * d - 5 * d * d < limit; x++) {
                int n = 6 * x * d - 5 * d * d;
                solutionCounts[n]++;
            }
        }

        int uniqueCount = 0;
        for (int n = 1; n < limit; n++) {
            if (solutionCounts[n] == 1) uniqueCount++;
        }

        return uniqueCount;
    }
}
