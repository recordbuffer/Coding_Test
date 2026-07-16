# 코딩테스트 공부 가이드 (휴대용)

> 이 파일은 어느 머신에서든(집 맥북 포함) 코테를 이어서 공부하기 위한 자료다.
> 규칙 · 템플릿 · 추천 문제 · 풀이 로그만 담는다. 다른 개인 정보는 넣지 않는다.
> 실제 풀이는 프로그래머스 / 백준 / LeetCode 브라우저에서 하고, 결과만 여기 기록한다.

## 목표

- **7월 20문제, 8월 누적 50문제.**
- 고난도 마스터가 아니라 **쉬움~중간 난이도를 안정적으로 푸는 것**이 목표다.

## 규칙

1. **Python으로만 한다.** Java를 다시 익히는 비용이 크다.
2. **30분 막히면 해설을 본다.** 본 뒤에는 코드를 보지 않고 다시 구현한다.
3. **한 문제를 2시간 이상 붙잡지 않는다.** 초반엔 오래 고민하는 것보다 패턴을 많이 접하는 게 낫다.
4. **템플릿은 외워도 된다.** BFS, DFS, 이진 탐색, 힙은 외우는 게 정상이다.
5. **복습 없는 풀이는 세지 않는다.** 틀린 문제는 1일 뒤, 3일 뒤 다시 푼다.

## 하지 말 것

- 어려운 문제 하나를 하루 종일 붙잡기
- Java로 다시 시작하기
- 모든 알고리즘을 완벽히 이해하려 하기
- 풀이 영상만 보고 직접 구현하지 않기
- 한 번 푼 문제를 다시 안 보기

---

## 진행

- 푼 문제 수: **4 / 20** (7월)
- 누적: **4 / 50** (8월)

## 풀이 기록

결과 표기: `O` 스스로 풀었음 / `△` 힌트 봄 / `X` 해설 봄

| 날짜 | 문제 | 유형 | 결과 | 다시 풀 날 |
|---|---|---|---|---|
| 2026-07-15 | 완주하지 못한 선수 (프로그래머스) | Hash | O | 2026-07-18 |
| 2026-07-15 | 폰켓몬 (프로그래머스) | Hash / Set | △ | 완료(7/16) |
| 2026-07-15 | 전화번호 목록 (프로그래머스) | Sorting / String | X | 완료(7/16) |
| 2026-07-16 | 폰켓몬 (복습) | Hash / Set | O | 2026-07-19 |
| 2026-07-16 | 전화번호 목록 (복습) | Sorting / String | O | 2026-07-19 |
| 2026-07-16 | 같은 숫자는 싫어 (프로그래머스) | 배열/중복 | △ | 2026-07-17 |

---

## 유형 순서와 추천 문제

### 7월

#### 1. Hash / String / Sorting

- 프로그래머스: 완주하지 못한 선수, 폰켓몬, 전화번호 목록, 같은 숫자는 싫어, 문자열 내 마음대로 정렬하기, K번째수, 모의고사, 실패율
- 백준: 10818 최소·최대, 1157 단어 공부, 1181 단어 정렬, 1764 듣보잡
- 체크: dict로 빈도 세기, set으로 중복 제거·존재 확인, sorted key 사용, split/join/count

#### 2. Stack / Queue

- 프로그래머스: 올바른 괄호, 기능개발, 프로세스, 주식가격, 다리를 지나는 트럭
- 백준: 9012 괄호, 10828 스택, 10845 큐, 1966 프린터 큐
- 체크: stack 문제를 보면 push/pop 구조가 떠오르는가? deque로 queue를 쓸 수 있는가?

#### 3. BFS 기초

- 프로그래머스: 타겟 넘버, 네트워크
- 백준: 1260 DFS와 BFS, 2606 바이러스
- 체크: BFS 템플릿을 외워서 쓸 수 있는가? visited를 언제 체크하는지 아는가?

### 8월

#### 4. Two Pointer / Binary Search

- 프로그래머스: 구명보트, 예산, 입국심사(어려우면 해설 후 재구현)
- 백준: 1920 수 찾기, 2805 나무 자르기
- 체크: left/right/mid 구조를 쓸 수 있는가? "정답을 이진 탐색한다"를 이해하는가?

#### 5. BFS / DFS 심화

- 프로그래머스: 게임 맵 최단거리, 단어 변환(어려우면 해설 후 재구현)
- 백준: 1012 유기농 배추, 2178 미로 탐색, 2667 단지번호붙이기
- 체크: 2차원 grid 범위 체크, 최단거리는 BFS라는 감각

#### 6. Heap / 기본 DP

- 프로그래머스: 더 맵게, 체육복, 정수 삼각형
- 백준: 11279 최대 힙, 1927 최소 힙, 1931 회의실 배정, 1463 1로 만들기, 9095 1,2,3 더하기
- 체크: heapq로 최대 힙을 흉내낼 수 있는가? 점화식을 세울 수 있는가?

### 시작 순서

프로그래머스 Level 1 → Level 2 쉬운 것 → 백준 Bronze~Silver → LeetCode Easy

---

## 템플릿

### 입출력

```python
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
```

### 빈도 / 정렬

```python
from collections import Counter, defaultdict

counter = Counter(arr)
sorted_arr = sorted(arr, key=lambda x: (x[0], -x[1]))
```

### Stack

```python
stack = []
for x in arr:
    if stack and condition:
        stack.pop()
    else:
        stack.append(x)
```

### Queue

```python
from collections import deque

q = deque()
q.append(x)
cur = q.popleft()
```

### Two Pointer

```python
left, right = 0, len(arr) - 1
while left < right:
    total = arr[left] + arr[right]
    if total < target:
        left += 1
    elif total > target:
        right -= 1
    else:
        break
```

### Binary Search (정답을 탐색)

```python
left, right = 0, max_value
answer = 0
while left <= right:
    mid = (left + right) // 2
    if can(mid):
        answer = mid
        left = mid + 1
    else:
        right = mid - 1
```

### Graph BFS

```python
from collections import deque

q = deque([start])
visited = {start}

while q:
    cur = q.popleft()
    for nxt in graph[cur]:
        if nxt not in visited:
            visited.add(nxt)
            q.append(nxt)
```

### Grid BFS

```python
from collections import deque

directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
q = deque([(0, 0)])
visited[0][0] = True

while q:
    x, y = q.popleft()
    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny]:
            visited[nx][ny] = True
            q.append((nx, ny))
```

### DFS

```python
def dfs(cur):
    visited.add(cur)
    for nxt in graph[cur]:
        if nxt not in visited:
            dfs(nxt)
```

### Heap

```python
import heapq

heap = []
heapq.heappush(heap, x)
smallest = heapq.heappop(heap)

# 최대 힙
heapq.heappush(heap, -x)
largest = -heapq.heappop(heap)
```

### 기본 DP

```python
dp = [0] * (n + 1)
dp[1] = 1

for i in range(2, n + 1):
    dp[i] = dp[i - 1] + dp[i - 2]
```

---

## 오답노트

틀린 문제는 여기에. `문제 / 왜 틀렸나 / 다음에 뭘 볼까` 한 줄씩.

| 날짜 | 문제 | 왜 틀렸나 | 다음 체크포인트 |
|---|---|---|---|
| 2026-07-16 | 같은 숫자는 싫어 | set으로 풀려다 순서·연속중복 개념 놓침, `res.add`(list엔 append), `range(len-1)` off-by-one으로 마지막 원소 누락 | "연속 중복 제거"는 set이 아니라 `res[-1]`와 비교. list는 append. res를 arr[0]로 시작하면 range는 full len |
