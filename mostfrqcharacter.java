

public class mostfrqcharacter {
    public static int MostFre(String s){
        int n=s.length();
        int maxfreq=-1;
        char ans=s.charAt(0);
        for (int i = 0; i < n; i++) {
            int freq=1;
            char ch=s.charAt(i);
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)==ch) freq++;
            }
            
            if(freq>maxfreq){
                maxfreq=freq;
                ans=ch;
            }
            else if(freq==maxfreq && ch<ans){
                ans=ch;
            }
        }
        System.out.print(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s="Radheyshayamiiii";
        MostFre(s);
        
    }
}
