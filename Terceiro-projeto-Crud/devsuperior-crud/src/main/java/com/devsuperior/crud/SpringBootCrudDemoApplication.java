package com.devsuperior.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@SpringBootApplication
public class SpringBootCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudDemoApplication.class, args);
	}
}

//	CHECKLIST:
//			1. Busca por id retorna cliente existente ok

//2. Busca por id retorna 404 para cliente inexistente ok

//3. Busca paginada retorna listagem paginada corretamente ok

//4. Inserção de cliente insere cliente com dados válidos / ok

//5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos -- retorna 400 bad request

//6. Atualização de cliente atualiza cliente com dados válidos ok

//7. Atualização de cliente retorna 404 para cliente inexistente -- 500 internal server error

//8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos --400 bad request

//9. Deleção de cliente deleta cliente existente ok

//10. Deleção de cliente retorna 404 para cliente inexistente -- ok
//}
