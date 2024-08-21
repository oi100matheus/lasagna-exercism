public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int reais){
        return 40-reais;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int qntcamada){
        return 2*qntcamada;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int qntcamada,int tempoforno){
        return preparationTimeInMinutes(qntcamada)+tempoforno;
    }
}
