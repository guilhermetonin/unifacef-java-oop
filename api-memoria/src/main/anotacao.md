# `Spring Boot`
### `Padrão MVC`
> Organiza o código separando as responsabilidades em `três` camadas principais.

* **Model** =  Gerencia os dados e as regras de negócio; comunica-se diretamente com a persistência.
* **View** =  Interface de saída; em APIs, representada pelo retorno de dados em `JSON`.
* **Controller** =  Intermediário que recebe requisições, processa via `Model` e define a resposta da `View`.

---

### `Produto` (Model)
> Define a estrutura do `objeto` de dados no sistema.

* **Atributos** =  Campos fundamentais como `id`, `nome`, `preco` e `qtde`.
* **Getters e Setters** =  Permitem que o `Spring Boot` (via `Jackson`) serialize e especifique dados ao converter `JSON`.

---

### `ProdutoService` (Service)
> Gerencia a `lógica de negócio` e o armazenamento em memória.

* **@Service** = indica ao Spring que a classe gerencia `lógica` e `dados`, habilitando sua `injeção de dependência`.
* **cria(produto)** = atribui `ID` automático, incrementa o contador e persiste na `lista`.
* **remove(id)** = utiliza `removeIf` para localizar e excluir o registro pelo identificador.
* **atualiza(id, novo)** = localiza o índice `(i)` via loop `for` e aplica `.set(i, novo)` para substituição.

---

### `ProdutoController` (Controller)
> Exposição de `endpoints` e controle de tráfego `HTTP`.

* **@RestController** = define a classe como um controlador REST para respostas em `JSON`.
* **@RequestMapping("/produto")** = estabelece o prefixo de rota `localhost = 8080/produto`.
* **@Autowired** = habilita a `injeção de dependência` e permite chamar `métodos` do `ProdutoService` sem instanciá-lo.
* **@RequestBody** = converte o corpo da requisição `JSON` em um `objeto` funcional.
* **@PathVariable** = captura variáveis dinâmicas enviadas diretamente na `URL`.
* **ResponseEntity** = encapsula a resposta, permitindo controle sobre o dado e o `Status Code`.

---

### `Status Codes`
> Padrões de resposta utilizados para validação (`Insomnia`/`Postman`).

* **`Sucesso 200 (OK)`** = operações de consulta (`GET`) ou atualização (`PUT`/`PATCH`).
* **`Sucesso 201 (Created)`** = criação de novos recursos (`POST`).
* **`Sucesso 204 (No Content)`** = exclusões onde **não** há corpo de retorno (`DELETE`).
* **`Erro 404 (Not Found)`** = retornado quando o `ID` solicitado **não** existe ou **não** localizado.