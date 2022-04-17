package toy.collection;

public class MemberCollection
{

    private int memberId;
    private String memberName;
    private int memberAge;
    private long memberHeight;
    private String memberClass;

    // MD: 생성자
    public MemberCollection(int memberId,
                            String memberName,
                            int memberAge,
                            long memberHeight,
                            String memberClass)
    {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberHeight = memberHeight;
        this.memberClass = memberClass;
    }

    // MD: toString()
    public String toString()
    {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    // MD: Getter & Setter
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberClass() {
        return memberClass;
    }

    public void setMemberClass(String memberClass) {
        this.memberClass = memberClass;
    }

    public long getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(long memberHeight) {
        this.memberHeight = memberHeight;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }
}
    /*
    Collection
     - 하나의 자료를 모아서 관리 ( <-> Map 쌍으로 관리 )
     - List, Set
     - add(), clear(), Iterator<E>, remove(), size()

    List
     - 순서있는 자료 관리
     - 중복 허용
     - ArrayList, Vector, LinkedList, Stack, Queue

    Set
     - 순서 없음
     - 중복 미허용
     - HashSet, TreeSet

     */
