package Utils;


import Model.Livro;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Isaias Silva
 */
public class HibernateTest {

    public static void main(String[] args) throws SQLException {

        Livro livro = new Livro();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(livro);
        t.commit();
        System.out.println("ID do Pessoa: " + livro.getId());
        
      //  user = (Usuario) session.load(Usuario.class, 1L);
      //  System.out.println(user.getNome());

        session.close();

    }
}
