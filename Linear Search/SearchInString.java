public class SearchInString {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        int ans = linearSearch(name, target);
        System.out.println(ans);
    }

    static int linearSearch(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return i;
            }
        }
        return -1;  // Return -1 if the target character is not found
    }
}
