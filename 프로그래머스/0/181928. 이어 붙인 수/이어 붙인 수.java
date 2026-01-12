class Solution {
    public int solution(int[] num_list) {
        String odd="";
        String even="";
        
        for(int num: num_list){
            if(num%2==0){
                even += num;
            } else{
                odd += num;
            }
        }
        
        int oddNum = odd.isEmpty() ? 0 : Integer.parseInt(odd);
        int evenNum = even.isEmpty() ? 0 : Integer.parseInt(even);
        
        int answer = oddNum + evenNum;
        return answer;
    }
}