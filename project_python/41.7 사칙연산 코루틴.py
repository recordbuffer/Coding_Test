def calc():
    result=0
    while True:
        expression=(yield result)
        a,operator,b=expression.split()
        if operator=='+':
            result=int(a)+int(b)
        elif operator=='-':
            result=int(a)-int(b)
        elif operator=='*':
            result=int(a)*int(b)
        elif operator=='/':
            result=int(a)/int(b)


expressions=input().split(', ')

c=calc()
next(c)

for e in expressions:
    print(c.send(e))

c.close()




