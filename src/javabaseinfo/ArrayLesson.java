/*
@Author:LiuHuiting
@Date:2019/7/6 10:28
@Description:数组的使用
*/
package javabaseinfo;
import  java.util.*;


public class ArrayLesson {
    /*
    * @Date:11:03 2019/7/6
    * @Description: 冒泡排序算法
    * @param:[nums]
    * @return:void
    **/
    public static void arrayMethod(int[] nums) {
        int temp;
        System.out.print("初始顺序为：");
        for(int num:nums){
            System.out.print(num +" ");
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){ //外层循环控制排序趟数
            for(int j=0;j< nums.length-1;j++){  //内层循环控制内一趟排序多少次
                if (nums[j]< nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }
        System.out.print("冒泡排序后的顺序为：");
        for(int num:nums){
            System.out.print(num +" ");
        }
    }
    /*
    * @Date:11:41 2019/7/6
    * @Description:二分法排序算法的使用
    * 数组在调用前必须排序好的。如果查找值包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) + 1)。
    * @param:[nums, x]
    * @return:void
    **/
    public static void binarySearchMethod(int[] nums,int x){
        System.out.print("初始顺序为：");
        for(int num:nums){
            System.out.print(num +" ");
        }
        System.out.println();
        //调用方法进行排序
        Arrays.sort(nums);
        System.out.print("排序后的顺序为：");
        for(int num:nums){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("使用二分法排序，得出数字"+x+"对应的位置是"+Arrays.binarySearch(nums,x));
    }
    /*
    * @Date:11:56 2019/7/6
    * @Description:自定义使用递归实现二分查找，找不到对应数据时返回值都是-1（网上百度的）
    * 参考博文：https://www.cnblogs.com/asis/p/6815522.html
    *           https://blog.csdn.net/qq_40178464/article/details/79942814
    * @param:[arr, start, end, key]
    * @return:int
    **/
    public static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end){
            return -1;
        }
        int mid = (end + start) >>> 1;
        if(arr[mid] == key) {
            return mid;
        }else if(arr[mid] < key) {
            return binarySearch(arr, mid + 1, end, key);
        }else if(arr[mid] > key){
            return binarySearch(arr, start, mid - 1, key);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,98,15,66,59,20};
        int[] arr2={6,3,8,2,9,1};
//        System.out.println("=======调用冒泡排序算法======");
//        arrayMethod(arr);
//        System.out.println();
        System.out.println("=======调用二分法排序算法======");
        binarySearchMethod(arr2,7);
    }
}
