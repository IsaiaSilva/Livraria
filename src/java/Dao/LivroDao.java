package Dao;

import Model.Livro;
import java.util.List;

/**
 *
 * @author Isaias Silva
 */
public interface LivroDao {

    public void save(Livro livro);
    public Livro getLivro(long id);
    public List<Livro> list();
    public void remove(Livro livro);
    public void update(Livro livro);

}
