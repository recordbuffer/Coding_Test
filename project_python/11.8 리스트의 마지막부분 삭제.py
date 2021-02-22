x=input().split()

del x[-5:len(x)]
print(tuple(x))
