class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(b)-map.get(a));
        StringBuilder ans=new StringBuilder();
        for(char ch:list){
            int count=map.get(ch);
            for(int i=0;i<count;i++){
                ans.append(ch);

            }
        }
        return ans.toString();
        
    }
}
