package Dao;

import Model.Livro;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Isaias Silva
 */
public class LivroDaoImp implements LivroDao {

    //Cria Livro
    public void save(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(livro);
        t.commit();
    }
    
    public Livro getLivro(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Livro) session.load(Livro.class, id);
    }
    
    //Seleciona Livro
    public List<Livro> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Livro").list();
        t.commit();
        return lista;
    }
    
    //Exclui Livro
    public void remove(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(livro);
        t.commit();
    }    
    
    //Atualiza Livro
    public void update(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(livro);
        t.commit();
    }
}
