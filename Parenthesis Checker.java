class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> res=new Stack<>();
       
        
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(x.charAt(i)=='{' || x.charAt(i)=='(' || x.charAt(i)=='['){
               res.push(ch);
            } else if(res.empty()==true){
                return false;
            }
            
            else if(ch=='}' && res.peek()!='{'){
                return false;
            }
            else if(ch==')' && res.peek()!='('){
                return false;
            }
            else if(ch==']' && res.peek()!='['){
                return false;
            }
            else{
                res.pop();
            }
            
           
        }
        if(!res.empty()){
            return false;
        }
        return true;
    }
}
