public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven()-time;
    }
    
    public int preparationTimeInMinutes(int noOfLayers){
        return 2*noOfLayers;        
    }
    
    public int totalTimeInMinutes(int noOfLayers,int time){
        return preparationTimeInMinutes(noOfLayers)+time;
    }
}
