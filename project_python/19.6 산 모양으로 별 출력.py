h=int(input())

for i in range(h):
    for j in reversed(range(h)):
        if i<j:
            print(' ',end='')
        else:
            print('*',end='')
    for j in range(h):
        if i>j:
            print('*',end='')
    print()
    
