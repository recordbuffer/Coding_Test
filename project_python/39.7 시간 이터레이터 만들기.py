class TimeIterator:
    def __init__(self,start,stop):
        self.start=start
        self.stop=stop

    def __getitem__(self,index):
        if index < self.stop-self.start:
            second=(self.start+index)
            second%=60
            minute=(self.start+index)//60
            minute%=60
            hour=(self.start+index)//60//60
            hour%=24
            return '{0:02d}:{1:02d}:{2:02d}'.format(hour,minute,second)
        
        else:
            raise IndexError

start, stop, index = map(int, input().split())
 
for i in TimeIterator(start, stop):
    print(i)
 
print('\n', TimeIterator(start, stop)[index], sep='')


