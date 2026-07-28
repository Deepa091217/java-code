public class Anagram {
    public static void main(String[]args){
        String str = "NATHIYA";
        String str1 = "YATHINA";
        char[]arr = str.toCharArray();
        char[]arr1 = str1.toCharArray();
        if(arr.length != arr.length)
        {
            System.out.println("Not An Anagram");
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != arr[i])
          {
                System.out.println("Not An Anagram.");
                return;
            }  
        }
        System.out.println("An Anagram.");
    }
}
