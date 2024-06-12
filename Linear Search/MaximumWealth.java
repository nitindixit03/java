public class MaximumWealth {
    public static void main(String[] args){
        int[][] accounts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int ans = MaximumWealth(accounts);
        System.out.println(ans);
    }
    public static int MaximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length; person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
