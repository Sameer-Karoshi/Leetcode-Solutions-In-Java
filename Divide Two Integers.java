/*
IMPORTANT TEST CASES :

Input : dividend =-2147483648  and divisor= -1  (Note : Integer.MIN_VALUE = - 2147483648)
Output : Quotient = 2147483647   (Note : Integer.MAX_VALUE = 2147483647)

Input : dividend =-2147483648  and divisor= 1  (Note : Integer.MIN_VALUE = - 2147483648)
Output : Quotient = -2147483648   

Input : dividend =-2147483648  and divisor= 2  (Note : Integer.MIN_VALUE = - 2147483648)
Output : Quotient = -1073741824  

Input : dividend =-2147483648   and divisor= -3  (Note : Integer.MIN_VALUE = - 2147483648)
Output : Quotient = 715827882

*/
class Solution {
   public int divide(int Dividend, int Divisor) {
          
           long dividend=Dividend,divisor=Divisor;
       
           if(divisor==1)
             return (int)dividend;
       
           if(dividend==Integer.MIN_VALUE && divisor==-1) //Corner Case
             return Integer.MAX_VALUE;
           
       
            int signOfQuotient=1;
             
            if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))
	           signOfQuotient=-1; //Quotiient will be negative
		 
              
            divisor=Math.abs(divisor);
            dividend=Math.abs(dividend);
             
            int quotient=0;
            while(dividend>=divisor)
            {
               dividend=dividend-divisor;
               quotient++;
            }
		
            if(signOfQuotient==-1)
              quotient=-quotient;
		 
		return quotient;  
   }
}
