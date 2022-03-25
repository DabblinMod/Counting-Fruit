public class CountFruit{

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        //Sam's house range: s-t
        //apple tree loc: a , orange tree loc: b
        //m is num of apples, n is num of oranges
        //apples and oranges hold the distances
        int applesLen=apples.size(), orangesLen=oranges.size();
        int countA=0, countO=0;//apples and oranges which are in range
        for(int i=0; i < applesLen; i++){
          //  System.out.println("Before: "+apples.get(i));
            apples.set(i, apples.get(i)+a);//sets the size of each
         //   System.out.println("After adding to apple dist: "+apples.get(i));
        }
        for(int i=0; i < orangesLen; i++){
          //  System.out.println("Before: "+oranges.get(i));
            oranges.set(i, oranges.get(i)+b);//sets the size of each
            //System.out.println("After not to orange dist: "+oranges.get(i));
        }
        //check if the distances are in the range of the house
        for(int i=0; i < applesLen; i++){
            if(apples.get(i) >= s && apples.get(i) <= t){
                countA++;
            }
        }
        for(int i=0; i < orangesLen; i++){
            if(oranges.get(i) >= s && oranges.get(i) <= t){
                countO++;
            }
        }
        System.out.println(countA);
        System.out.println(countO);
    }  
}