import java.lang.Math;

public class Sorts {
  public static void selectionSort(int [] ary){
    int store;
    for (int i = 0; i < ary.length; i++){
      store  = ary[i];
      for (int j = i + 1; j < ary.length; j++){
        if (ary[j] < store){
        store = ary[j];
        ary[j] = ary[i];
        ary[i] = store;
        }
      }
      ary[i] = store;
    }
  }
  public static String toStringIntArray(String[] args){
    int[] convert = new int[args.length];
    for (int i = 0; i < args.length; i++){
      convert[i] = Integer.parseInt(args[i]);
    }
    //selectionSort(convert);
    //bubbleSort(convert);
    String result = "[";
    for (int i = 0; i < args.length; i++){
      result += " " + convert[i];
    }
    return result + "]";
  }
  public static int[] toIntArray(String[] args){
    int[] convert = new int[args.length];
    for (int i = 0; i < args.length; i++){
      convert[i] = Integer.parseInt(args[i]);
    }
    return convert;
  }
  public static void bubbleSort(int[] args){
    int store;
    boolean swap = true;
    while (swap) {
      swap = false;
      for(int i = 1; i < args.length; i++){
        if (args[i-1] > args[i]){
          store = args[i-1];
          args[i-1] = args[i];
          args[i] = store;
          swap = true;
        }
      }
      for(int i = args.length - 2; i >= 0; i--){
        if (args[i] > args[i+1]){
          store = args[i];
          args[i] = args[i+1];
          args[i+1] = store;
        }
    }
  }
}
  public static void insertSort(int[] args){
    for(int i = 1; i < args.length;i++){
      int store = i/2;
      System.out.println("NEXT");
      for(int j = i/2, t = (i+2)/3; t != 0; j/=2, t/=3, System.out.println(store)){
        if (args[i] > args[store]){
          j = Math.abs(j);
        }
        else {
          j = Math.abs(j) * -1;
        }
      }
    }
  }


  public static void main(String[] args){
    /*
      int[] list = new int[4];
      for (int i = 0; i < list.length; i++ ){
        list[i] = Math.randInt() % 1000;
      }
      selectionSort(list);
      String result = "[";
      for (int i = 0; i < list.length; i++){
        result += " " + list[i];
      }
      System.out.println(result);
      */
      insertSort(toIntArray(args));
    }
  }
