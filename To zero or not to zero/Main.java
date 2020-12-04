m, n = map(int, input().split())
llen = len(str(n))
for i in range(m, n+1):
  rlen = len(str(i))
  diff = llen - rlen
  print(diff*'0' + str(i), end = ' ')
    