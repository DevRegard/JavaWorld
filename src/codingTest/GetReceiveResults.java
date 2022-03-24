package codingTest;

class GetReportResults
{
    public int[] solution(String[] id_list, String[] report, int k)
    {
        int[] countReport = {};



        return countReport;
    }
}

/*
[1]
    유저
      - 1회 1명
      - 신고횟수 무제한
      - 서로 다른 유저 계속 신고 가능
      - 동일인물 여러번 신고 가능 (단, 1회로 처리)

    게시글 정지
      - k번 이상 신고된 유저 = 정지
      - 신고한 모든 유저 <- 정지 사실 메일 발송
      - 마지막에 취합 후 -> 정지 -> 정지 메일 발송

    결과값
      - 각 유저별로 처리 결과 메일을 받은 횟수 반환

[2]
    알고리즘
      1) 유저 신고 받기
        - A가 B를 신고했다.
          - A는
          - B는
      2) 유저 신고 취합
        - 유저당 신고 당한 횟수
        - 해당 유저가 k회 이상 신고 받았는가?
          - 받았으면 '정지 명단' 갱신

      3) (신고 결과 반영)
      4) 신고 결과 발송
        - '정지 명단'
      Return) 각 유저별로 처리 결과 메일 받은 횟수

*/