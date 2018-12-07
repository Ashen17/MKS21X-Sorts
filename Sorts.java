public class Sorts {
  public static void selectionSort(int [] ary){
    int store, insert;
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
    selectionSort(convert);
    String result = "[";
    for (int i = 0; i < args.length; i++){
      result += " " + convert[i];
    }
    return result + "]";
  }
  public static void bubbleSort(){

  }
  public static void main(String[] args){
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
      System.out.println(toStringIntArray(args));
    }
  }
