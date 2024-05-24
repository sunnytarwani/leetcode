class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<List<Integer>> hashSet = new ArrayList<>();

        checkCombination( 1 , n , k , arrayList , hashSet );

        return hashSet;
    }

    public static void checkCombination( int j ,int n, int k, ArrayList<Integer> arrayList, List<List<Integer>> hashSet) {

        if(arrayList.size() == k){
            hashSet.add(new ArrayList<>(arrayList));
            return;
        }

        for(int i = j ; i <= n ; i++){
            arrayList.add(i);
            checkCombination(i+1 , n , k , arrayList , hashSet);
            arrayList.remove(arrayList.size()-1);

        }
    }
}