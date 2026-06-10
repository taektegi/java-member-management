package javaStudy;


public class Member {
    private Long id;
    private String name;
    private int age;

    public Member(Long id, String name, int age) throws IllegalArgumentException{
        if(id == null || id<=0 ){
            throw new IllegalArgumentException("0보다 큰 숫자를 입력해주세요.");
        }
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        if(age <= 0){
            throw new IllegalArgumentException("나이는 0 이상이어야 합니다.");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void changeName(String name) throws IllegalArgumentException{
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("변경할 이름을 입력해주세요.");
        }
        this.name = name;
    }
}
