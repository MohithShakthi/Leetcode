class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        ArrayList<Boolean> list=new ArrayList<>();
        int s=0;
        int r=0;
        for(int i=0;i<c.length;i++){
            s=c[i]+ec;
            r=0;
            for(int j=0;j<c.length;j++){
                if(s<c[j]){
                    r++;
                }
            }
            if(r!=0){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
}