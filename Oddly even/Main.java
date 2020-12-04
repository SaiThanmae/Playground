n = input()
oddSum=0
evenSum=0
flag=True
for i in n:
  if(flag):
    oddSum+=int(i)
    flag=False
  else:
    evenSum+=int(i)
    flag=True

print(abs(oddSum-evenSum))