package codingTest;

class GetReportResults
{
    public int[] solution(String[] id_list, String[] report, int k)
    {
        int[] answer = {};
        return answer;
    }
}

/*
유저
  - 1회 1명
  - 신고횟수 무제한
  - 서로 다른 유저 계속 신고 가능
  - 동일인물 여러번 신고 가능 (단, 1회로 처리)

게시글 정지
  - k번 이상 신고된 유저 = 정지
  - 신고한 모든 유저 <- 정지 사실 메일 발송
  - 마지막에 취합 후 -> 정지 -> 정지 메일 발송

*/