import java.util.Random;

class Main {
  public static void main(String[] args) {

    int min = 1;
    int max = 100;

    //Generating a random number
    Random r = new Random();
    int randomNumber = min + r.nextInt(max);
    System.out.println("Generated random number is: "+randomNumber);

    //Checking whether the number is odd or even

    if(randomNumber%2==0){
      System.out.println("The generated random number is even.");
    }else{
      System.out.println("The generated random number is odd.");
    }
        
  }
}