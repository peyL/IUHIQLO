public class BubbleSort {
    public static void main(String [] args){
        int [] arr1 =new int[] {23,45,1,32,21,90};
        System.out.print("输出数组:");
        for (int a :
             arr1) {
            System.out.print(a+"\t");
        }System.out.println("\n使用冒泡排序法排序");
        int swa;
        for (int i = 1;i<arr1.length;i++){
            for(int j = 0;j<arr1.length-i;j++){
                if(arr1[j]>arr1[j+1]){
                    swa=arr1[j+1];
                    arr1[j+1]=arr1[j];
                    arr1[j]=swa;
                }
            }System.out.print("第"+i+"轮排序后:");
            for (int a :
                 arr1) {
                System.out.print(a+"\t");
            }System.out.println();
        }
    }
}
