package leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {
//        System.out.println(s.length());
        if(s.length()==0){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        if(s.startsWith(")") || s.startsWith("]") || s.startsWith("}")){
            return false;
        }
        if(s.endsWith("(") || s.endsWith("[") || s.endsWith("{")){
            return false;
        }
        for(int i=0;i<s.length();i++) {
            int followingOpenParenthesis = 0;
            int precedingCloseParenthesis = 0;

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                int beginIndex = i;
                int endIndex = s.length();
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
                        followingOpenParenthesis++;
                    } else {
                        followingOpenParenthesis--;
                        if(followingOpenParenthesis==-1){
                            endIndex=j;
                            break;
                        }
                    }
                }

//                System.out.println(beginIndex + " " + endIndex);
                if (endIndex > s.length() - 1) {
                    return false;
                }
                if ((s.charAt(beginIndex) == '(' && s.charAt(endIndex) == ')') || (s.charAt(beginIndex) == '{' && s.charAt(endIndex) == '}') || (s.charAt(beginIndex) == '[' && s.charAt(endIndex) == ']')) {
                    continue;
                } else {
                    return false;
                }
            }

            else{
                int endIndex = i;
                int beginIndex = -1;
                for (int j = i - 1; j > -1; j--) {
                    if (s.charAt(j) == ')' || s.charAt(j) == '}' || s.charAt(j) == ']') {
                        precedingCloseParenthesis++;
                    } else {
                        precedingCloseParenthesis--;
                        if(precedingCloseParenthesis==-1){
                            beginIndex=j;
                            break;
                        }
                    }
                }

//                System.out.println(beginIndex + " " + endIndex);
                if (beginIndex < 0) {
                    return false;
                }
                if ((s.charAt(beginIndex) == '(' && s.charAt(endIndex) == ')') || (s.charAt(beginIndex) == '{' && s.charAt(endIndex) == '}') || (s.charAt(beginIndex) == '[' && s.charAt(endIndex) == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses=new ValidParentheses();
        System.out.println(validParentheses.isValid("(([]){})"));
    }
}
