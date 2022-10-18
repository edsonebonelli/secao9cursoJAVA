import java.util.Locale;
import java.util.Scanner;
import entities.Product;

/*
* ANTIGO CÓDIGO
*/
/*
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

Product product = new Product();
System.out.println("Enter product data: ");
System.out.print("Name: ");
product.name = sc.nextLine();
System.out.print("Price: ");
product.price = sc.nextDouble();
System.out.print("Quantity in stock: ");
product.quantity = sc.nextInt();

System.out.println();
System.out.println("Product data: " + product);

System.out.println();
System.out.print("Enter the number of products to be added in stock: ");
int quantity = sc.nextInt();
product.addProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);

System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");
quantity = sc.nextInt();
product.removeProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);

sc.close();
  }
}

package entities;

public class Product {

public String name;
public double price;
public int quantity;

public double totalValueInStock() {
return price * quantity;
}

public void addProducts(int quantity) {
this.quantity += quantity;
}

public void removeProducts(int quantity) {
this.quantity -= quantity;
}

public String toString() {
return name
+ ", $ "
+ String.format("%.2f", price)
+ ", "
+ quantity
+ " units, Total: $ "
+ String.format("%.2f", totalValueInStock());
  }
}
*/

/*
 * CONSTRUTORES
 * É uma operação especial da classe, que executa no momento da instanciação do objeto.
 * 
 * USO COMUNS:
 * Iniciar valores dos atributos.
 * Permitir ou obrigar que o objeto receba dados
 * Dependências no momento de sua instanciação (injeção de dependência)
 * Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão.
 * Construtor padrão ==> (Product p = new Product();)
 * É possível especificar mais de um construtor na mesma classe(sobrecarga)
 * 
 * PROBLEMA EXEMPLO:
 * enter product date:
 * Name: TV
 * Price: 900.00
 * Quantity in Stock: 10
*/

/*
* PROPOSTA DE MELHORIA USANDO CONSTRUTORES
*/

public class construtores {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter product data: ");
      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Price: ");
      double price = sc.nextDouble();

      System.out.print("Quantity in stock: ");
      int quantity = sc.nextInt();
      new Product(name, price, quantity);
    }

  }
}

/*
 * PALAVRA THIS
 * É uma referência para o próprio objeto
 * USOS COMUNS:
 * Diferenciar atributos de variáveis locais.
 * Passar o próprio objeto como argumento na chamada de um método ou construtor.
 */

/*
 * SOBRECARGA
 * É um recurso que uma classe possui de oferecer mais de uma operação com mesmo
 * nome.
 * Porém com diferentes listas de parâmetros.
 * 
 * PROPOSTA DE MELHORIA
 * Vamos criar um construtor opcional, o qual recebe apenas nome e preço.
 * A quantidade em estoque deste novo produto, por padrão, deverá
 * então ser iniciada com o valor zero.
 * 
 * NOTA: é possivel também incluir um construtor padrão.
 */

/*
 * ENCAPSULAMENTO
 * É um princípio que consiste em esconder detalhes de implementação de
 * uma classe, expondo apenas operações seguras e que mantenham os objetos
 * em estado consistente.
 * 
 * Regra de ouro: o objeto deve sempre estar me estado consistente, e a própria
 * classe deve garantir isso.
 * 
 * REGRA GERAL BÁSICA
 * Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
 * Os atributos devem ser acessados por meio de métodos GET e SET.
 */

/*
 * MODIFICADORES DE ACESSO
 * PRIVATE: O membro só pode ser acessado na própria classe.
 * (NADA): O membro só pode ser acessado nas classes do mesmo pacote.
 * PROTECTED: O membro só pode ser acessado no mesmo pacote.
 * PUBLIC: O membro é acessado por todas classes ao menos que resida em
 * módulos diferente que não exporte o pacote onde ele está).
 */
