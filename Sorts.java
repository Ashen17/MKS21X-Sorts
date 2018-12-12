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
  public static String toStringIntArray(String[] args, String sort){
    int[] convert = new int[args.length];
    for (int i = 1; i < args.length; i++){
      convert[i] = Integer.parseInt(args[i]);
    }
    if (sort.equals("insert")){insertSort(convert);}
    if (sort.equals("select")){selectionSort(convert);}
    if (sort.equals("bubble")){bubbleSort(convert);}
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
      int store = (i)/2;
      for(int j = i/2; j != 0 & args[store]!=args[i]; store += j, j/=2){
        if (args[i] > args[store]){j = Math.abs(j);}
        else {j = Math.abs(j) * -1;}
      }
      if (args[i] > args[store]){
        store ++;
      }
      int save = args[i];
      for(int j = i; j != store; j--){
        args[j] = args[j-1];
      }
      args[store] = save;
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
      int[] list;
      list = (toIntArray(args));
      System.out.println(list);
    }
  }
