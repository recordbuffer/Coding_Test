with open('28.4words.txt','r')as file:
    for line in file:
        words=line.split()
        for word in words:
            if list(word)==list(reversed(word)):
                print(word.strip())
    
