class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map=new HashMap();
        for (String x : strs){
            String z =sortIt(x);
            if(!map.containsKey(z)){
                map.put(z,new ArrayList<>());
            }
            map.get(z).add(x);
        }
    
      return new ArrayList <>(map.values());
    }

     String sortIt (String s){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        return new String (c);
    }
}
