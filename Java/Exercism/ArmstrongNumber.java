import java.lang.Math;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {        
        int noOfDigits=0;
        int temp=numberToCheck;
        while(temp>0){
            noOfDigits++;
            temp=temp/10;
        }
        int org=numberToCheck;
        int res=0;
        while(numberToCheck>0){
            int r=numberToCheck%10;
            res=res+(int)Math.pow(r,noOfDigits);
            numberToCheck/=10;
        }
        return (res==org);
    }

}