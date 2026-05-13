package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// indica ao Spring que esta classe gerencia lógica e dados e pode ser "injetada" em outros lugares
@Service
public class ProdutoService {
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    private Long id = 1L; // gerador de IDs

    // consulta os produtos que estão na lista
    public List<Produto> consulta() {
        return this.listaProdutos;
    }

    // insere um produto na lista
    public Produto cria(Produto produto) {
        produto.setId(id);
        id++;
        this.listaProdutos.add(produto);

        return produto;
    }

    // remove um produto com id
    public boolean remove(Long id) {
        // removeIf: percorre a lista automaticamente
        // p -> p.getId().equals(id): para cada produto "p", verifica se o ID dele é igual ao ID enviado
        return this.listaProdutos.removeIf(p -> p.getId().equals(id));
    }

    // atualiza um produto por id
    public Produto atualiza(Long id, Produto novo) {
        novo.setId(id);

        // percorre a lista
        for (int i = 0; i < this.listaProdutos.size(); i++) {
            // verifica se o ID do produto na posição 'i' é o que queremos
            if (this.listaProdutos.get(i).getId().equals(id)) {
                // encontrado
                this.listaProdutos.set(i, novo); // atualiza via .set(index, novoValor)
                return novo;
            }
        }
        return null; // produto não encontrado para atualizar
    }
}
