def solution(s):
    answer = False
    st = []

    for x in s:
        if x == '(':
            st.append(x)
        else:
            if st:
                st.pop()
            else:
                return False

    if not st:
        answer = True

    return answer
