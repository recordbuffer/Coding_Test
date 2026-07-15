# 프로그래머스 - 완주하지 못한 선수
# 유형: Hash
# 2026-07-15


# 풀이 1: 내가 생각해낸 방식 (정렬 후 비교)
# 정렬하면 완주자와 참가자가 앞에서부터 같은 순서로 맞아떨어진다.
# 처음으로 어긋나는 지점의 참가자가 완주하지 못한 사람.
# 시간복잡도: O(n log n) — 정렬이 지배적.
def solution_sort(participant, completion):
    participant.sort()
    completion.sort()

    i = 0
    while i < len(completion):
        if participant[i] == completion[i]:
            i += 1
        else:
            return participant[i]
    return participant[-1]


# 풀이 2: Counter 방식 (해시)
# 참가자 빈도에서 완주자 빈도를 빼면 완주 못 한 선수 하나만 남는다.
# 동명이인이 있어도 빈도로 처리되므로 안전.
# 시간복잡도: O(n) — 해시 카운팅.
from collections import Counter


def solution(participant, completion):
    return list(Counter(participant) - Counter(completion))[0]
