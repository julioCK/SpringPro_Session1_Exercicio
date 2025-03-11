package juliock.springPro.session1.desafio.program;

import juliock.springPro.session1.desafio.entities.Order;
import juliock.springPro.session1.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

/* @ComponentScan sinaliza ao spring boot quais pacotes devem ser escaneados em busca de componentes do Spring.
 * 	Por padrão o Spring procura por componentes a partir do pacote onde se encontra a classe principal incluindo seus subpacotes.
 * 	Caso os componentes nao estejam aninhados dentro do pacote onde se encontra a classe principal, essa annotation é necessária.
 * 	Também é necessário especificar os pacotes que serão incluídos na busca por componentes.
 * */


@ComponentScan({"juliock.springPro.session1.desafio"})
@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the order cod: ");
		int orderCod = sc.nextInt();
		System.out.print("Enter the base price: ");
		double base = sc.nextDouble();
		System.out.print("Enter the discount: ");
		double discount = sc.nextDouble();

		Order order = new Order(orderCod, base, discount);

		System.out.println();
		System.out.printf("	Pedido código %d", orderCod);
		System.out.println();
		System.out.printf("	Valor total: R$ %.2f", orderService.total(order));
	}
}
