package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetReceiveResult
{
    public int[] solution(String[] id_list, String[] report, int k)
    {
        int[] ret = new int[id_list.length]; // (이용자 아이디 만큼 배열 생성)
        Map<String, Integer> index = new HashMap<>(); //
        Map<String, List<Integer>> list = new HashMap<>(); // 신고받은 자

        //
        for(int i = 0 ; i < id_list.length ; i++) // 유저 수 만큼
            index.put(id_list[i], i); // 인덱스에 key:유저 인덱스, value: 인덱스


        //
        for(String rep : report) // 이용자가 신고한 정보만큼
        {
            String[] ids = rep.split(" "); // 공백으로 나눈 값
            String fromId = ids[0], toId = ids[1]; // 0은 신고자 1은 신고받은 자
            if(!list.containsKey(toId)) // 리스트에 신고받은 자의 정보(key)가 없으면
                list.put(toId, new ArrayList<>()); // 리스트에 (신고받은 자, Arraylist)를 넣는다.
            List<Integer> tmp = list.get(toId); // 신고 받은 자의 키값
            if(!tmp.contains(index.get(fromId))) // 신고 받은자의 키 리스트에 신고자가 없으면??
                tmp.add(index.get(fromId)); //신고받은 자에 신고자를 추가한다.?
        }

        //
        for(int i = 0 ; i < id_list.length ; i++) // 이용자 수 만큼
        {
            String id = id_list[i]; // 이용자 1명 추출
            if(list.containsKey(id) && list.get(id).size() >= k) // [신고리스트]에 존재하고, [신고리스트]의 수가 k보다 많으면
                for(int idx : list.get(id)) //[신고리스트] 아이디값 만큼
                    ret[idx]++; // ret + 1씩 추가한다
        }

        return ret; // 유저수 순서대로 각 유저가 받은 결과 메일 수
    }
}
