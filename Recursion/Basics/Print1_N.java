public class Print1_N {
    public static void number(int i,int j){
        if(i==j)return;
        System.out.println(i);
        i++;
        number(i,j);
    }
    public static void main(String[] args) {
        number(0,5);
    }
}
