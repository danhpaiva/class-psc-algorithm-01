import java.util.Scanner;

public class Divertidamente {
  public static void main(String[] args) {

    int emocaoAlegria = 0, emocaoTristeza = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nOlá, Riley.\nQuantas amizades você fez na nova cidade?");

    int qtdeAmizade = scanner.nextInt();

    if (qtdeAmizade == 0) {
      emocaoTristeza += 30;
    } else {
      emocaoAlegria += (qtdeAmizade * 10);
    }

    System.out.println("\nRiley.\nQual a nota da sua prova A1?");
    int notaA1 = scanner.nextInt();

    System.out.println("\nRiley.\nQual a nota da sua prova A2?");
    int notaA2 = scanner.nextInt();

    System.out.println("\nRiley.\nQual a nota da sua prova A3?");
    int notaA3 = scanner.nextInt();

    int media = (notaA1 + notaA2 + notaA3) / 3;

    if (media >= 7) {
      emocaoAlegria += 50;
    } else {
      emocaoTristeza += 50;
    }

    System.out.println("\nQuantos dos 10 algoritmos de programação você conseguiu resolver?");
    int qtdeAlgoritm = scanner.nextInt();

    if (qtdeAlgoritm == 0) {
      emocaoTristeza += (10 * 10);
    } else if (qtdeAlgoritm > 0) {
      emocaoAlegria += (qtdeAlgoritm * 10);
      emocaoTristeza += ((10 - qtdeAlgoritm) * 10);
    }

    if (emocaoAlegria > emocaoTristeza) {
      System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
    } else {
      System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
    }
    scanner.close();
  }
}