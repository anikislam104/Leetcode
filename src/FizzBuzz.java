import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                String s="FizzBuzz";
                answer.add(s);
            }
            else if (i%3==0) {
                String s="Fizz";
                answer.add(s);
            }
            else if(i%5==0){
                String s="Buzz";
                answer.add(s);
            }
            else{
//                System.out.println("hello");
                String s= String.valueOf(i);
                answer.add(s);
            }
        }
        return answer;
    }
}
public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}
