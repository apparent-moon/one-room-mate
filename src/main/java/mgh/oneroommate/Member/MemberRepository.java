package mgh.oneroommate.Member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getUSER_ID();
    }

    public Member find(Long USER_ID) {
        return em.find(Member.class, USER_ID);
    }

}
