 public class Main {
    public static void main(String[] args) {
        int num = 1;
        for (int i=1;i<=4;i++){
            for (int j=4;j>i;j--){
        System.out.print("  ");
    }
    int start=num+i-1;
    for (int j=0;j<i;j++){
        System.out.print(start-j + " ");
}
num=num+i;
System.out.println();
}
    }
 }
