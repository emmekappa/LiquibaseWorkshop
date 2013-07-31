package liquibaseworkshop;

import liquibaseworkshop.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Michele Cantelli
 * Date: 31/07/13
 * Time: 11.44
 * To change this template use File | Settings | File Templates.
 */
public class ProductRepositoryTest {
    private SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    @Test
    public void testSave() throws Exception {
        Session session = sessionFactory.openSession();
        try {
            Product product = new Product();
            product.setName("Antani");
            session.save(product);
        } finally {
            session.close();
        }

    }
}
