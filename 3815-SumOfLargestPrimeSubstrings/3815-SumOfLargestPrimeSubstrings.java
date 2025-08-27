// Last updated: 27/08/2025, 23:21:15

class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<String> a = new HashSet<>();
        ArrayList<Long> b = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (!str.isEmpty() && Character.isDigit(str.charAt(0))) {
                    if (str.length() > 1 && str.startsWith("0")) {
                        continue;
                    }
                    a.add(str);
                }
            }
        }
        for (String str : a) {
            long n = Long.parseLong(str);
            boolean isPrime = true;
            if (n > 1) {
                for (long j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    b.add(n);
                }
            }
        }
        Collections.sort(b, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < Math.min(3, b.size()); i++) {
            sum += b.get(i);
        }
        return sum;
    }
}
