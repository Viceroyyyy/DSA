public class fileVersion {
    public static int getFileVersion(String[] arr, int length){
        String str = "File";
        if(length == 0)
        return -1;
        int max = Integer.MIN_VALUE;
        for(String element: arr){
            String[] fileparts = element.split("_");
            
            if(fileparts[0].compareTo(str)==0){
                if(fileparts[1].charAt(0)-'0' > max){
                    max = fileparts[1].charAt(0)-'0';
                }
            }
        }
        if(max>0)
        return max;
        else
        return -1;
    }
    public static void main(String[] args) {
        String[] fileArray = {"File_1", "File_3", "Document_2", "File_5", "File_2"};
        int length = fileArray.length;
        
        int maxVersion = getFileVersion(fileArray, length);
        
        if (maxVersion != -1) {
            System.out.println("The highest file version is: " + maxVersion);
        } else {
            System.out.println("No valid file versions found.");
        }
    }
}
