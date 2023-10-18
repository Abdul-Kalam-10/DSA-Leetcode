class Solution { 
    public String intToRoman(int num) { 
    String roman = ""; //
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; //int numbers
    String[] romanletter = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; //roman numbers
    for(int i=0; i<values.length; i++){  //loop 0 to length in integer val
      while(num >= values[i]){   //while cond
        roman = roman + romanletter[i]; //roman = empty str + roman letter
        num = num - values[i]; //num(input) - val 
    }
}
  return roman; //roman value
    }
}