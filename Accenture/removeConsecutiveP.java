public class removeConsecutiveP {
    public static void main(String[] args){
        String str = "pppapppppp";
        StringBuilder sb = new StringBuilder(str);

        int count = 0;
        int remove_count = 0;
        for(int i=0; i<sb.length();i++){
            if(sb.charAt(i) == 'p'){
                count++;
            }else{
                count = 0;
            }

            if(count == 3){
                sb.deleteCharAt(i);
                count--;
                remove_count++;
                i--;
            }

        }

        System.out.println(remove_count);
    }
}
