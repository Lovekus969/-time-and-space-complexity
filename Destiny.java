public class Destiny {
    public static void main(String[] args) {
        String mindset = "Unstoppable";
        String path = getSuccessPath("2^n");

        if (mindset.equals("Unstoppable") && path != null) {
            System.out.println("🚀 Winning Every Battle. Sky Jet Mode Activated.");
        }
    }

    static String getSuccessPath(String currentLevel) {
        switch (currentLevel) {
            case "2^n": return "DP";
            case "n^2": return "Greedy";
            case "n log n": return "DivideAndConquer";
            default: return "O(1)";
        }
    }
}
                                                