public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char result = nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than target is: " + result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If left is out of bounds, we need to wrap around to the start of the array
        return letters[left % letters.length];
    }
}

