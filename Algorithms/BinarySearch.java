public class BinarySearch {
    public static void main(String[] args) {
        int[] entries ={12,14,16,18,20,22,24,26,28,30};
        int target = 10;
        int WinnerIndex = binarySearch(entries, target);
        if (WinnerIndex==-1){
            System.out.println("The target was not found in the list.");
        }
        else{
            System.out.println("Winner Index: " + WinnerIndex);
        }

    }

    public static int binarySearch(int[] entries, int target){
        int low=0;
        int high=entries.length-1;
        while (low<=high){
            int midpoint=(low+high)/2;
            if (entries[midpoint]==target){
                return midpoint;
            }
            else if(entries[midpoint]<target){
                low=midpoint+1;

            }
            else if(entries[midpoint]>target){
                high=midpoint-1;
            }

            System.out.println("Current midpoint index: " + midpoint);
        }

        return -1;
    }
}
