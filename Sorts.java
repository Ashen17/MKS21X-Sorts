public class Sorts {
  public static void selectionSort(int [] ary){
    int store;
    for (int i = 0; i < ary.length; i++){
      store = ary[i];
      for (int j = i; j < ary.length; j++){
        if (ary[j] < store){store = ary[j];}
      }
    }
  }
  public static void main(String[] args){
      int[] list = new int[]{42, 11, 32, 99};
      System.out.println(list);
    }
  }
