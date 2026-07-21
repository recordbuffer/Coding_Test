def solution(progresses, speeds):
    # 각 기능이 며칠 걸리는가?
    days = []
    for p, s in zip(progresses, speeds):
        i = 0
        while(p < 100):
            p += s
            i += 1
        days.append(i)

    # 앞에서부터 묶기: 첫 기능이 기준, 기준보다 늦으면 새 묶음
    answer = []
    base = days[0]
    cnt = 1
    for d in days[1:]:
        if d <= base:      # 기준일 안에 끝남 = 같이 배포됨
            cnt += 1
        else:              # 기준일보다 늦음 = 새 묶음 시작
            answer.append(cnt)
            base = d
            cnt = 1

    answer.append(cnt)     # 마지막 묶음
    return answer
