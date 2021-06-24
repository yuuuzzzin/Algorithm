class Solution {
    public int getLength(int position, int number) {        
        
        return Math.abs(number - position) / 3
            + Math.abs(number - position) % 3;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int lNum = 10; // *을 10으로
        int rNum = 12; // #을 12로
        
        for (int number : numbers) {
            
            // 가운데 열이면
            if(number % 3 == 2 || number == 0) {
                
                // 0이면 11로
                if(number == 0)
                    number = 11;
                
                int lLength = getLength(lNum, number);
                int rLength = getLength(rNum, number);
                
                // 더 가까운 손가락 사용
                if(lLength < rLength) {
                    sb.append("L");
                    lNum = number;
                }
                else if(lLength > rLength) {
                    sb.append("R");
                    rNum = number;
                }
                
                // 거리가 같으면 무슨 손잡이인지에 따름
                else {
                    if(hand.equals("left")) {
                        sb.append("L");
                        lNum = number;
                    } else {
                        sb.append("R");
                        rNum = number;
                    }                
                }                
            }
            
            // 왼쪽 열이면
            else if(number % 3 == 1) {
                sb.append("L");
                lNum = number;
            }
            
            // 오른쪽 열이면
            else {
                sb.append("R");
                rNum = number;
            }
                
        }
        
        return sb.toString();
    }
}