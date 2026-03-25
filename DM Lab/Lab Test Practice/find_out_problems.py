x = 50

def func():
    global y
    print('x is', y)
    y = 2
    print('Changed global x to', y)
    y = 10

print('Value of x is', y)
y=12
print('Value of x is', y)