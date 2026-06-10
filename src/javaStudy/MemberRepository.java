package javaStudy;

import java.util.Map;
import java.util.HashMap;

public class MemberRepository {
    public final Map<Long, Member> repo = new HashMap<>();

    public void save(Member member){
        repo.put(member.getId(), member);
    }
    public Member findbyId(Long id){
        return repo.get(id);
    }
    public void delete(Long id){
        repo.remove(id);
    }
    public Map<Long, Member> findAll(){
        return repo;
    }

}

