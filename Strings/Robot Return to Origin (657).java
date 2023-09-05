class Solution {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;           //x , y axis is (0,0)
        for(int i=0;i<moves.length();i++){  //i at 0 move till end 
            if(moves.charAt(i) == 'U'){  //at U up y axis pos y++
                y++;
            }
            else if(moves.charAt(i) == 'D'){ //at D down y asix neg y--
                y--;
            }
            else if(moves.charAt(i) == 'L'){ //at L left x axis x--
                x--;
            }
            else{
                x++;   //at R right x pos x++
            }
        }
        if(x==0 && y==0) //both x and y as (0,0)
        return true;  //robo returned to original position(true)
        return false;  //if not reached return(false)
    }
}