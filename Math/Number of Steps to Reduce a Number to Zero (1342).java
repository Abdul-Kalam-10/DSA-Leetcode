class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;  //init a var steps
        while(num>0){  //num greater than 0 a +ve int
            if(num%2 == 0) //even number
            num = num/2;
            else
            num--;   //odd number
            steps++; //inc the steps count
        }
        return steps; //final steps count
    }
}