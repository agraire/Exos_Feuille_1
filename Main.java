import java.util.Scanner;



class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello world! \nAntoine");
    System.out.print("Ecrire un nombre: ");
    int nombre = scanner.nextInt();
    for(int i=1; i<=10 ; i++)
      {
            System.out.println(nombre + " x " + i + " = " +nombre * i);
      }
  }
}