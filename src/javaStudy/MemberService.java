package javaStudy;

public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public void join(Member member) throws IllegalArgumentException{
        if(findMember(member.getId()) != null){
            throw new IllegalArgumentException("이미 가입된 회원입니다.");
        }
        if(member == null){
            throw new IllegalArgumentException("회원 정보가 없습니다.");
        }
        memberRepository.save(member);
    }
    public Member findMember(Long id){
        Member member = memberRepository.findbyId(id);
        return member;
    }
    public void changeName(Long id, String newName) throws IllegalArgumentException{
        Member member =  findMember(id);
        member.changeName(newName);
    }
    public void deleteMember(Long id) throws IllegalArgumentException{
        if(findMember(id)== null){
            throw new IllegalArgumentException("회원정보가 존재하지 않습니다.");
        }
        memberRepository.delete(id);
    }

}
