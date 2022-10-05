import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(canWolk(generateRandomAge(),23));
        System.out.println(canWolk(generateRandomAge(),20));
        System.out.println(canWolk(generateRandomAge(),-10));
        System.out.println(canWolk(generateRandomAge(),35));
        System.out.println(canWolk(generateRandomAge(),41));
        System.out.println(generateRandomAge());



    }

    public static  String canWolk(int age, int temperature) {
        if (age>20 && age<45 && temperature>=-20 && temperature<= 30){
            return ( " Можно идти гулять");
        }
        else if( age <20 && temperature>=28){
            return ("Можно идти гулять");}
        else if (age>45 && temperature>=-10  &&temperature<= 20){
            return ("Можно идти гулять");

        } else {
            return ("Оставайтесь дома");
        }

    }
    public static  int generateRandomAge(){
        Random random= new Random();
        int a= random.nextInt(100);
        return a;
    }


}
