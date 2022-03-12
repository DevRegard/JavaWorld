package factory;

import java.util.HashMap;

public class FifthClass
{
    public static void main(String[] args)
    {
        int[] mainKey = {1,2,3,18};
        String[] mainValue = {"일","이","삼","십팔"};
        HashMap mainMap = putHashMap(mainKey, mainValue);
        System.out.println("해쉬맵 값 : " + mainMap);

        checkDeleteMap(mainMap);
        System.out.println("해쉬맵 값 : " + mainMap);
    }

    public static HashMap<Integer, String> putHashMap(int[] aa, String[] bb)
    {
        HashMap hm = new HashMap<>();
        int i;
        for (i = 0; i < aa.length; i++)
        {
            if (aa.length != bb.length)
            {
                System.out.println("두 배열의 길이가 일치하지 않습니다.");
                break;
            }
            else hm.put(aa[i], bb[i]);
        }
        return hm;
    }

    public static HashMap<Integer, String> checkDeleteMap(HashMap hm)
    {
        if (hm.containsValue("십팔"))
        {
            System.out.println("::: [System] 부적절한 단어가 감지되었습니다. :::");
            hm.clear();

//            [ 특정 value 값 채우 후, 해당 key 삭제하기 ]
//            hm.keySet();
//            hm.remove(hm.get(18));
//            hm.remove(18);
//            System.out.println(hm.keySet().contains(18));
//            System.out.println(hm.values().contains("십팔"));
        }
        return hm;
    }
}