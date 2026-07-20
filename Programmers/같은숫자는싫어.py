def solution(arr):
    res = [arr[0]]
    
    for x in arr:
        if x != res[-1]:
            res.append(x)

    return res  