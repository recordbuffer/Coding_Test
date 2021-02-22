prices=list(map(int,input().split(';')))
prices.sort(reverse=True) #내림차순 정렬
for i in prices:
    print('{0:>9,}'.format(i))
