public class MultipleSum {
    public static void main(String[] args) {
        System.out.println(sum(2,3,4,5,566,7));
        
    }
    static int sum(int... num){
        
        int total=0;
        for (int i=0;i<num.length;i++){
            total+=num[i];
        }
        return total;
    }
}
