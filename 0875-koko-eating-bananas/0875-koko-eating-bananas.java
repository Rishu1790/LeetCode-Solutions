class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000; // Direct max possible value le li
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            long totalHours = 0;

            // Pura logic isi loop ke andar
            for (int pile : piles) {
                // Short way to write: if(pile % mid != 0) totalHours += (pile/mid) + 1;
                // Simple version:
                totalHours += pile / mid;
                if (pile % mid != 0) {
                    totalHours++;
                }
            }

            if (totalHours <= h) {
                high = mid; // Ye speed kaam kar rahi hai, aur choti speed check karo
            } else {
                low = mid + 1; // Speed bahut kam hai, badhao ise
            }
        }
        
        return low;
    }
}