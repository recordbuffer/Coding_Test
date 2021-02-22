col, row=map(int,input().split())

matrix=[]
for i in range(row):
    matrix.append(list(input()))

for i in range(row):
    for j in range(col):
        if matrix[i][j]=='*':
            continue
        else:
            matrix[i][j]==0
