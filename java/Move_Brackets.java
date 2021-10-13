//https://codeforces.com/problemset/problem/1374/C

import java.util.*;
import java.util.Stack; 

public class Move_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String S = sc.next();
            for(int j=0;j<S.length();j++){
                stk.push(S.charAt(j));
                if(stk.size()>1){
                    if(stk.peek()==')' && stk.get(stk.size()-2)=='('){
                        stk.pop();
                        stk.pop();
                    }
                }
            }
            System.out.println(stk.size()/2);
            stk.clear();
        }
        sc.close();
    }   
}
