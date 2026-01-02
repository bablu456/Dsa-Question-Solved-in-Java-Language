package BinarySearchQuestions;

public class CountNegativeNumber1351 {
    static int findnumber(int[][] arr){
      int rows = arr.length;
      int col = arr[0].length;
      int res = 0;
      int negative = arr[0].length - 1;
      for(int row = 0;row<rows;row++){
          if(arr[row][0]<0){
              res += col;
              continue;
          }
          if(arr[row][col-1]>0){
              continue;
          }
          int l = 0, r = negative;
          while(l<=r){
              int mid = l + (r-l) / 2;
              if(arr[row][mid]<0){
                  r = mid - 1;
              }else{
                  l = mid + 1;
              }
          }
          res += (col - l) ;
          negative = l;
      }
      return res;
    }
    public static void main(String[] args){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int size = grid.length;
//        System.out.println(size);
        System.out.println(findnumber(grid));
    }
}
