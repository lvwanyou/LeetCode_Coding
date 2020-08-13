public class 4Search_2D_array{
	   public boolean Find(int target, int [][] array) {
	        if(array == null || array.length ==0 || array[0].length == 0){
	            return false;
	        }
	        int rows_begin = 0;
	        int columns = array[0].length - 1;
	        while(rows_begin <= array.length-1 && columns >= 0){
	            if( array[rows_begin][columns] == target){
	                return true;
	            }else if(array[rows_begin][columns]> target){
	                columns--;
	            }else{
	                rows_begin++;
	            }           
	        }
	        return false;
	    }
}