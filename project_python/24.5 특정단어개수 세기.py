paragraph=input().split()

count=0
for words in paragraph:
    if (words.strip(',.')=='the'):
        count+=1
print(count)
