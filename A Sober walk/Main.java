n = int(input())
counter = 0
x,y  = 0, 0
for i in range(n):
  if counter == 0:
    x = abs(x) + 10
    y = abs(y)
    counter = 1
  elif counter==1:
    y+=20
    counter=2
  elif counter==2:
    x = - (x+10)
    counter = 3
  elif counter == 3:
    y = -y
    counter = 0
    
print(x,y, end=' ')
    