n, tlen = map(int, input().split())
result = 0
for i in range(tlen):
  result += n
  n = result - 1
print(result)