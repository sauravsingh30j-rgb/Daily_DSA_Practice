// Last updated: 24/09/2025, 02:06:15
// bad version

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo+( hi-lo) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

    }
}