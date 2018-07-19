package main.java.com.testando.email;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.com.testando.email.envio.Mailer;
import main.java.com.testando.email.envio.Mensagem;

public class SpringEmailMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringEmailMain.class.getPackage().getName());
		
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("Alexandre Teste <mateus.gaara037@gmail.com>", 
				Arrays.asList("Testes AlgaWorks <mateus037@gmail.com>")
				, "Aula Spring E-mail", "Olá! \n\n O envio de e-mail deu certo!"));
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}
}