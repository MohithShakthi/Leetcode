class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26){
            return false;
        }
        else{
            String a="abcdefghijklmnopqrstuvwxyz";
            char[] alpha=a.toCharArray();
            char[] sen=s.toCharArray();
            int sum=0; 
            for(int i=0;i<alpha.length;i++){
                for(int j=0;j<sen.length;j++){
                    if(alpha[i]==sen[j]){
                        sum++;
                        break;
                    }
                }
            }
            if(sum==26){
                return true;
            }
            else{
                return false;
            }

        }
    }
}