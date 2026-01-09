package New;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
       

        System.out.println(isThere(arr, target));
        
        int[] arr2 = {90,75,18,12,6,4,3,1};
        int a =75;
        System.out.print(DescendingOrderSorted(arr2, a));
        
        int []arr3 = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int b  = 22;
        System.out.println(OrderAgnosticBinSearch(arr3,b));
    }
    
    public static boolean isThere(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
    
    public static int DescendingOrderSorted(int[]arr,int target) {
    	//When the array is in descending order
    	
    	int l = 0,r = arr.length-1;
    	
    	while(l<=r) {
    		int mid = l+r /2;
    		
    		if(arr[mid] == target) {
    			return mid;
    		}else if(arr[mid] >target ) {
    			l = mid +1;
    		}else {
    			r = mid -1;
    		}
    	}
    	return -1;
   }
    
    public static int OrderAgnosticBinSearch(int[]arr,int target) {
    	int l = 0;
        int r = arr.length - 1;
    	
    	// find whether the array is sorted in asc or desc 
        
    	boolean isAsc  = arr[l] < arr[r];
    	
    	

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
            	return mid;
            }
            if(isAsc) {
            	if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }else {
            	if(arr[mid] == target) {
        			return mid;
        		}else if(arr[mid] >target ) {
        			l = mid +1;
        		}else {
        			r = mid -1;
        		}
            }
           
        }
        return -1;    }
}
