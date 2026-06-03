package dc.unifacef.produtos_api.service;

import dc.unifacef.produtos_api.model.Categoria;
import dc.unifacef.produtos_api.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // registra esta classe como o componente de regras de negócio do Spring
public class CategoriaService {

    // cria o elo com o banco de dados trazendo o Repository
    private CategoriaRepository repository;

    // construtor para Injeção de Dependência
    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    // listar tudo, todas as categorias salvas
    public List<Categoria> listar() {
        return repository.findAll();
    }

    // buscar por id
    // Optional evita erros, caso não exista
    public Optional<Categoria> buscar(Long id) {
        return repository.findById(id);
    }

    // inserir uma nova categoria
    @Transactional
    public Categoria inserir(Categoria c) {
        return repository.save(c);
    }

    // deletar uma categoria existente
    @Transactional
    public boolean deletar(Long id) {
        if (repository.existsById(id)) { // id realmente existe?
            repository.deleteById(id); // deleta do banco
            return true;
        }
        return false; // não existe
    }
}
