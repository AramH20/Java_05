public class GoodNumber {

    public String goodNumber(int M) {
        String numberType;
        if(M%7 == 0 && M%9 == 0){
            numberType = "Good Number";

        }else if(M%7 != 0 && M%9 == 0){
            numberType = "Bad Number";

        }else if(M%11 == 0){
            numberType = "Poor Number";

        }else {
            numberType = "-1";
        }
        return numberType;


    }

}
