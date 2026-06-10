package javaStudy;

public class Main {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();

        joinSafely(memberService, 1L,"김택수",23);
        joinSafely(memberService,2L,"박제호",23);
        joinSafely(memberService,3L,"홍정우",23);
        joinSafely(memberService,4L,"유정민",0);
        joinSafely(memberService,5L,"",23);
        joinSafely(memberService,null,"박진우", 23);

        memberService.changeName(2L,"제펌킨");
        System.out.println(memberService.findMember(2L).getName());

        memberService.deleteMember(3L);
        try{
            memberService.deleteMember(3L);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void joinSafely(MemberService memberService, Long id, String name, int age){
        try{
            Member member = new Member(id,name,age);
            memberService.join(member);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

