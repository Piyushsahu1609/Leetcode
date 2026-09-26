class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int maxfruits=0;
        for(int end = 0;end<fruits.length;end++){
        int c = fruits[end];
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>2){
                int  d = fruits[start];
                map.put(d,map.get(d)-1);
                if(map.get(d)==0){
                    map.remove(d);

                }
                start++;
            }
            maxfruits = Math.max(maxfruits, end-start+1);

        }
        return maxfruits;
        
    }
}