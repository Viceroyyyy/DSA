public class printMtarix {

    public static String Rhymes(String str,String[] arr,int length){
        int max = -1;
        StringBuilder sb = new StringBuilder();

        for(String element: arr){
           if (element.compareTo(str)== 0){
            continue;
           }
           int count = 0;
           int str_index = str.length()-1;
           for(int i=element.length()-1;i>=0;i--){
            char c = element.charAt(i);
            if(c==str.charAt(str_index)){
                count++;
                str_index--;
            }
            else{
                break;
            }
           }

           if(count>max){
            max=count;
            sb.setLength(0);
            sb.append(element);
           }


        }
        if (max==0)
        return "No Word";
        else
        return sb.toString();
    }
    
        // int Matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        public static void main(String[] args) {
            // Example input string
            String testString = "thunder";
    
            // Example array of strings
            String[] words = {"puzzle", "thunder", "powder", "blender", "under"};
    
            // Get the rhyming word
            String result = Rhymes(testString, words, testString.length());
    
            // Print the result
            System.out.println("The rhyming word for '" + testString + "' is: " + result);
        }
        

         
    
}
