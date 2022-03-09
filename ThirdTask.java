public class ThirdTask {
    ThirdTask(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        ThirdTask[] arr = new ThirdTask[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = new ThirdTask(i+"");
        }
    }
}