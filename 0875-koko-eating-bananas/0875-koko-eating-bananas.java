class Solution {
   public int minEatingSpeed(int[] piles, int h) {
    int low = 1, high = 1000000000; // Direct max value ya array se max nikal lo
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (canEatAll(piles, mid, h)) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return low;
}

// Yahan bhi hum sirf array read kar rahe hain
public boolean canEatAll(int[] piles, int speed, int h) {
    long hours = 0;
    for (int pile : piles) {
        hours += (pile + speed - 1) / speed; // Ceiling division without Math.ceil
    }
    return hours <= h;
}}