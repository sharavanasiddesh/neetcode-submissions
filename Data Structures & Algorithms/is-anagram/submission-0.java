class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map =new  HashMap<>();
        for(int i =0;i<s.length();i++){
            char key=s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);

            
        }
        for(int j=0 ; j<t.length();j++){
            char key = t.charAt(j);
            int count = map.getOrDefault(key,0)-1;
            map.put(key,count);

        }
        for(int c:map.values()){
            if (c != 0){
                return false;
            }
        }
        return true;
        


    }
}
