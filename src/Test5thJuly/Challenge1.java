package Test5thJuly;

public class Challenge1 {
    public static void main(String[] args) {
         Integer age = 15;
           if(age < 18){
               try {
                   throw new InvalidAgeException("Age cannot be less than 18");
               }
               catch (InvalidAgeException e){
                   throw new RuntimeException(e);
               }
           }else{
               System.out.println("Age is correct");
           }
    }
}

class  InvalidAgeException extends  Exception{
  InvalidAgeException(String message){
      super(message);
  }
}
