class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
          for(char x:s.toCharArray()){
          if(x=='['||x=='{'||x=='('){
            stack.push(x);
          }else{
            if(stack.isEmpty()){
              return false;
              }
            char w=stack.pop();
             if(x=='}' && w!='{' ||
                x==']' && w!='[' ||
                x==')' && w!='(' 
                )return false;
              
               }
          }
         return stack.isEmpty();
    }
}
