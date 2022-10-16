//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//необходимо как-то оповестить пользователя

public class DZfirst2 {
    public static void main(String[]args){
           
    }
    int[] a = {10,9,8,7,6};
    int[] b = {5,4,3,2};
    
    static int minusOf(int[]a, int[]b){
        int []res = new int[5];
        int count = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0;j<b.length;j++){
                res[i]=a[i]-b[i];
                count ++;
                
            }
            System.out.println(res[i]);
        }
        return count;
    }
    static int inform(int[]a, int[]b){
        if (a.length!=b.length) {
            return -1; 
        }
        return 0;
    }
    
}


