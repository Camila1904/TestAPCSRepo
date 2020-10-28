public class Demo{
    public static void main (String[] args) {
        if (args.length==0) {
            printLoop(5);
        }
        else {
            printLoop(Integer.parseInt(args[0]));
        }
    }
    public static void printLoop (int n) {
        for (int i = 1;i<=n;i++) {
            for (int j = 0;j<=n-i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int[] a= {1,2,3,4};
        System.out.println(arrToString(a));
        int[][] b = {{1,2,3},{1,2,3}};
        System.out.println(arrayDeepToString(b));
        System.out.println(create2DArray(2,3,4));
    }
    public static String arrToString(int[] arr) {
      String Converted = "";
      for (int i=0; i<arr.length;i++) {
        String x = "";
        x= + arr[i] + "";
        if (i != arr.length-1) {
          Converted += x;
          Converted += ", ";
        }
        else {
          Converted += x;
        }
      }
      Converted = "{" + Converted + "}";
      return (Converted);
    }
    public static String arrayDeepToString (int[][] arr) {
      String Convert = "";
      if (arr.length == 0) {
        return "{}";
      }
      for (int i=0; i < arr.length-1; i++) {
        Convert = Convert + arrToString(arr[i]) + ", ";
      }
      Convert = "{" + Convert + arrToString(arr[arr.length-1]) + "}";
      return Convert;
    }
    public static int[][] create2DArray (int rows, int cols, int maxValue) {
      //  create2DArray will create and return an array of the size specified.
      // It will also fill the array with values from 0 to maxValue inclusive.
      int[][] arr = new int[rows][cols];
      for (int i=0; i<arr.length;i++) {
        for (int j=0; j<arr[i].length;j++) {
          arr[i][j] = (int)(Math.random() * (maxValue+1));
        }
      }
      return arr;
    }
    public static int[][] create2DArrayRandomized (int rows, int cols, int maxValue) {
      int[][] arr = new int[rows][];
      for (int i=0; i<rows;i++) {
        arr[i] = new int[(int)(Math.random()*(cols+1))];
      }
      for (int i = 0; i<arr.length;i++) {
        for (int j=0; j<arr[i].length;j++) {
          arr[i][j] = (int)(Math.random()*(maxValue +1));
        }
      }
      return arr;
    }
  }
