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
  public static int log2(int n){//logbase2 rounded down
    if (n != 0){
      return 1 + log2(n/2);
    }
    else {
      return -1;
    }
  }
  public static String toStringIntArray(String[] args, String sort){
    int[] convert = new int[args.length];
    for (int i = 0; i < args.length; i++){
      convert[i] = Integer.parseInt(args[i]);
    }
    if (sort.equals("insert")){insertionSort(convert);}
    if (sort.equals("select")){selectionSort(convert);}
    if (sort.equals("bubble")){bubbleSort(convert);}
    String result = "[";
    for (int i = 0; i < args.length; i++){
      result += " " + convert[i];
    }
    return result + "]";
  }
  public static String toStringArray(int[] args){
    String result = "[";
    for (int i = 0; i < args.length; i++){
      result += " " + args[i];
    }
    return result + "]";
  }
  public static int[] toIntArray(String[] args){
    int[] convert = new int[args.length];
    for (int i = 1; i < args.length; i++){
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
  public static void insertionSort(int[] args){
    for(int i = 1; i < args.length;i++){
      int store = args[i];
      int j = i;
      for(;j > 0 && args[j-1] > store; j-- ){
        args[j] = args[j-1];
      }
      /*
      int store = (i)/2;1
      for(int j = i/2; j != 0 & args[store]!=args[i]; j/=2, store += j){
        if (args[i] > args[store]){
          j = Math.abs(j);
          if (store % 2 == 0){store++;}
        }
        else {j = Math.abs(j) * -1;}
      }
      if (args[i] > args[store]){
        store ++;
      }
      else if (args[i] < args[store - 1]){store--;}
      int save = args[i];
      for(int j = i; j > store; j--){
        args[j] = args[j-1];
      }*/

      args[j] = store;
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
      /*
      int[] randish = new int[Integer.parseInt(args[0])];
      for(int i = 0 ; i < randish.length; i++){
        randish[i] =(int)(Math.random()*10000);
      }
      if(args[1].equals("selection")){
        Sorts.selectionSort(randish);
      }
      if(args[1].equals("bubble")){
        Sorts.bubbleSort(randish);
      }
      if(args[1].equals("insert")){
        Sorts.insertionSort(randish);
        */
      int[] data = new int[]{3,7,2,1,0};
      insertionSort(data);
      System.out.println(toStringArray(data));
      //}
    }
  }
