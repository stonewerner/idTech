public class LinearSearch {
    public static void main(String[] args) {
        int[] entries ={32, 14, 89, 62, 10, 20, 88, 40, 22,  91, 88, 65};
        int target = 99;
        int winner = linersearch(entries, target);
        if (winner==-1){
            System.out.println("The target was not found in the list.");
        }
        else{
            System.out.println("Answer number " + (winner+1) + " is the winner!");
        }

    }

    public static int linersearch(int[] entries, int target){
        for(int i = 0; i<12;i++){
            if (entries[i]==target){
                return i;
            }
        }
    return -1;
    }
}
