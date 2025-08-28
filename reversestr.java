public class reversestr{
    public static void main(String[] args) {
        // StringBuilder s=new StringBuilder("Radhey");         //create string
        // System.out.println(s);                                
        // s.reverse();
        // s.deleteCharAt(2);
        // s.insert(1,'m');
        // s.delete(3, 6);
        // System.out.println(s);
        // s.append("shayam");
        // int i=0;
        // int j=s.length()-1;
        // while (i<=j) {
        //     char c1=s.charAt(i);
        //     char c2=s.charAt(j);
        //     s.setCharAt(i, c2);
        //     s.setCharAt(j, c1);
        //     i++;
        //     j--;
        // }





        String sb="krishna";
        StringBuilder s=new StringBuilder(sb);
        s.reverse();
        System.out.println(s);         //This could have happened like that, then why was it used?




        System.out.println(s);
    }

}