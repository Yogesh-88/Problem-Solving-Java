public class CarsAssemble {
    public int findSuccessRate(int speed){
        int successRate=0;
        if(speed>=1 && speed<=4)
            successRate=100;
        else if(speed>=5 && speed<=8)
            successRate=90;
        else if(speed==9)
            successRate=80;
        else
            successRate=77;
        return successRate;
    }
    public double productionRatePerHour(int speed) {
        double goodCarsPercentage=(double)findSuccessRate(speed)/100;
        return speed*221*goodCarsPercentage;
    }

    public int workingItemsPerMinute(int speed) {
       return (int) productionRatePerHour(speed)/60;

        
    }           
}
