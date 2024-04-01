package br.com.alura.farmacia.dao;

import br.com.alura.farmacia.modelo.Fabricante;
import br.com.alura.farmacia.modelo.Produto;
import net.bytebuddy.asm.Advice;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;

public class FabricanteDao {

        private EntityManager em;

        public FabricanteDao(EntityManager em) {
            this.em = em;
        }

        public void cadastrar(Fabricante fabricante){
            this.em.persist(fabricante);
        }


    }
