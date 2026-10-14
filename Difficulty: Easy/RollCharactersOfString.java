class Solution {
    public String findRollOut(String s, int[] roll) {
       
        int n=s.length();
        int[] freq=new int[n+1];
        for(int x:roll){
            freq[x-1]++;
        }
        for(int i=n-1;i>0;i--){
            freq[i-1]+=freq[i];
        }
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            int shift=freq[i]%26;
            arr[i]=(char)('a'+(arr[i]-'a'+shift)%26);
        }
        return new String(arr);
    }
}
