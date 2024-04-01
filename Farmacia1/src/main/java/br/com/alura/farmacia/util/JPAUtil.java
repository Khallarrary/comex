package br.com.alura.farmacia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    public static final EntityManagerFactory FACTORY = Persistence.
            createEntityManagerFactory("farmaciaum");

    public static EntityManager getEntityMenager() {
        return FACTORY.createEntityManager();
    }
}
