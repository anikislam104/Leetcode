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
        for(int i=0;i<s.length();i++) {
            int followingOpenParenthesis = 0;
            int precedingCloseParenthesis = 0;
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {

                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
                        followingOpenParenthesis++;
                    } else {
                        break;
                    }
                }
                int beginIndex = i;
                int endIndex = i + 2 * followingOpenParenthesis + 1;
                System.out.println(beginIndex + " " + endIndex);
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

                for (int j = i - 1; j > -1; j--) {
                    if (s.charAt(j) == ')' || s.charAt(j) == '}' || s.charAt(j) == ']') {
                        precedingCloseParenthesis++;
                    } else {
                        break;
                    }
                }
                int endIndex = i;
                int beginIndex = i - 2 * precedingCloseParenthesis - 1;
                System.out.println(beginIndex + " " + endIndex);
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
