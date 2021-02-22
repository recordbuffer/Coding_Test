def html_tag(tag_name):
    def real_decorator(func):
        def wrapper():
            return ('<{0}>{1}</{0}>'.format(tag_name,func()))
        return wrapper
    return real_decorator

a,b=input().split()

@html_tag(a)
@html_tag(b)
def hello():
    return 'Hello, world!'

print(hello())
