###[1]
**문제**: <신고 결과 받기> 게시판 불량 이용자 신고 및 처리 결과 메일 발송 시스템

**기능**:
  1. 유저당 1번에 1명 신고
  2. 신고 횟수 제한 없음
  3. 한 유저 여러번 신고 가능 (단, 신고 1회 처리)
  4. k번 이상 신고된 유저 정지
  5. 정지된 사람을 신고한 모든 유저에게 메일 발송
  6. 유저 신고한 모든 내용 취합 후 한꺼번에 정지 및 메일 발송
>신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

>각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
> 
>다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.

**제한 사항**


---
###[2]

**자원**

**알고리즘**

**복잡도**

---
###[3]