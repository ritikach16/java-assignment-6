public class SecondTask {
    SecondTask(){
         this(40);
    }
    SecondTask(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        new SecondTask();
    }
}