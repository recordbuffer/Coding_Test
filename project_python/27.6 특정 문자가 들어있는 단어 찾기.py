with open('27.6words.txt','r')as file:
    for line in file:
        words=line.split()
        for word in words:
            if 'c' in word:
                print(word.strip(',.'))
