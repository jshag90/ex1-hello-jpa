package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            Member findMember = em.find(Member.class, member.getMemberId());
//            List<Member> members = findMember.get

            tx.commit();
        } catch (Exception e) {
            tx.rollback();

        } finally {
            em.close();
        }
        emf.close();
    }
}
