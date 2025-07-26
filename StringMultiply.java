class StringMultiply {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))return "0";
        int length1= num1.length();
        int length2=num2.length();
        int []result=new int [length1+length2];

        //now multofplyining the didgits
        for(int i=length1-1;i>=0;i--){
            int digit1= num1.charAt(i)-'0';
            for(int j=length2-1;j>=0;j--){
                int digit2=num2.charAt(j)-'0';
                int multiply=digit1*digit2;
                int carryPosition=i+j;
                int DigitcurrentPosition=i+j+1;
                int sum=multiply+result[DigitcurrentPosition];

                result[DigitcurrentPosition]=sum%10;
                result[carryPosition]+=sum/10;


            }
        }

        //waps se string me chonvert krna hai
        StringBuilder Stringg=new StringBuilder();
        for(int num:result){
            if(!(Stringg.length()==0&& num==0)){
                Stringg.append(num);

            }
        }
        return Stringg.length()==0?"0":Stringg.toString();

    }
}