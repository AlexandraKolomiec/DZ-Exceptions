//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:

	//1.1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
	//1.2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
	//1.3. если вместо массива пришел null, метод вернет -3
	//1.4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

public class Seminar1 {
    public static void main(String[] args) {
  
      int[] arr = null;
      indexOf(arr, 1);
    }
  
    static int indexOf(int[] array, int find) {
  
      if (array == null)
        return -3;
  
      if (array.length < 10)
        return -1;
  
      if (array.length > 3)
        if (array[2] == 1011)
          return -5;
        else
          return -51;
  
      if (array.length > 2022)
        return -4;
  
      int size = array.length;
  
      for (int i = 0; i < size; i++) {
        if (array[i] == find) {
          return i;
        }
      }
      return -2;
    }
  }