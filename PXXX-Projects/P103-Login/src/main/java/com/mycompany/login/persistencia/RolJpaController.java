package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public RolJpaController() {
        emf = Persistence.createEntityManagerFactory("LoginPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rol rol) {
        if (rol.getListaUsers() == null) {
            rol.setListaUsers(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Usuario> attachedListaUsers = new ArrayList<Usuario>();
            for (Usuario listaUsersUsuarioToAttach : rol.getListaUsers()) {
                listaUsersUsuarioToAttach = em.getReference(listaUsersUsuarioToAttach.getClass(), listaUsersUsuarioToAttach.getId());
                attachedListaUsers.add(listaUsersUsuarioToAttach);
            }
            rol.setListaUsers(attachedListaUsers);
            em.persist(rol);
            for (Usuario listaUsersUsuario : rol.getListaUsers()) {
                Rol oldUnRolOfListaUsersUsuario = listaUsersUsuario.getUnRol();
                listaUsersUsuario.setUnRol(rol);
                listaUsersUsuario = em.merge(listaUsersUsuario);
                if (oldUnRolOfListaUsersUsuario != null) {
                    oldUnRolOfListaUsersUsuario.getListaUsers().remove(listaUsersUsuario);
                    oldUnRolOfListaUsersUsuario = em.merge(oldUnRolOfListaUsersUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId());
            List<Usuario> listaUsersOld = persistentRol.getListaUsers();
            List<Usuario> listaUsersNew = rol.getListaUsers();
            List<Usuario> attachedListaUsersNew = new ArrayList<Usuario>();
            for (Usuario listaUsersNewUsuarioToAttach : listaUsersNew) {
                listaUsersNewUsuarioToAttach = em.getReference(listaUsersNewUsuarioToAttach.getClass(), listaUsersNewUsuarioToAttach.getId());
                attachedListaUsersNew.add(listaUsersNewUsuarioToAttach);
            }
            listaUsersNew = attachedListaUsersNew;
            rol.setListaUsers(listaUsersNew);
            rol = em.merge(rol);
            for (Usuario listaUsersOldUsuario : listaUsersOld) {
                if (!listaUsersNew.contains(listaUsersOldUsuario)) {
                    listaUsersOldUsuario.setUnRol(null);
                    listaUsersOldUsuario = em.merge(listaUsersOldUsuario);
                }
            }
            for (Usuario listaUsersNewUsuario : listaUsersNew) {
                if (!listaUsersOld.contains(listaUsersNewUsuario)) {
                    Rol oldUnRolOfListaUsersNewUsuario = listaUsersNewUsuario.getUnRol();
                    listaUsersNewUsuario.setUnRol(rol);
                    listaUsersNewUsuario = em.merge(listaUsersNewUsuario);
                    if (oldUnRolOfListaUsersNewUsuario != null && !oldUnRolOfListaUsersNewUsuario.equals(rol)) {
                        oldUnRolOfListaUsersNewUsuario.getListaUsers().remove(listaUsersNewUsuario);
                        oldUnRolOfListaUsersNewUsuario = em.merge(oldUnRolOfListaUsersNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<Usuario> listaUsers = rol.getListaUsers();
            for (Usuario listaUsersUsuario : listaUsers) {
                listaUsersUsuario.setUnRol(null);
                listaUsersUsuario = em.merge(listaUsersUsuario);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
