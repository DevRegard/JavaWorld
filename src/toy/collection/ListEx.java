package toy.collection;

import java.util.ArrayList;
import toy.collection.MemberCollection;

public class ListEx
{
    private ArrayList<MemberCollection> arrayList = new ArrayList<MemberCollection>();

    // MD: 생성자: 클래스형으로 선언한 ArrayList 생성 메서드
    public ListEx()
    {
        arrayList = new ArrayList<MemberCollection>();
    }

    // MD: ArrayList 클래스 속성 요소 추가 메서드
    public void addMember(MemberCollection member)
    {
        arrayList.add(member);
    }

    // MD:
    public boolean removeMember(int memberId)
    {
        for (int i = 0; i <arrayList.size(); i++)
        {
            MemberCollection member = arrayList.get(i); // 내부에서 배열 복사
            int tempId = member.getMemberId(); // 복사한 배열 가져오기
            if (tempId == memberId) // 복사한 배열의 아이디와 삭제할 아이디가 같은가?
            {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // MD:
    public void showAllMember()
    {
        for (MemberCollection member: arrayList)
            System.out.println(member);
        System.out.println( );
    }

}
