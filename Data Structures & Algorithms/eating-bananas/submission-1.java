class Solution { 
    public static boolean check(int n,int h, int    piles[]){
       int total = 0;
       for ( int x : piles){
           total += (x%n == 0)? x/n : (x/n)+1; 
         //  System.out.print(total + " ");
       }  
       System.out.println();
       //System.out.print("H : " + h +" " + "T :"+ total + " ");
       return total <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0 , maxi = Integer.MIN_VALUE;  
        for (int x : piles)
          maxi = Math.max(maxi , x);
        
        int st = 1 , end = maxi; 
         int mid = maxi;
        while (st<=end){ 
            if (check(mid ,h , piles)){ 
               // System.out.print( mid + " Possible");
                ans = mid;
                end=mid-1;
            }else{
                st =mid+1;
            }  
            mid = (st+end)/2; 
            //System.out.print(mid +" ");
        }

       return ans; 
    }
}
