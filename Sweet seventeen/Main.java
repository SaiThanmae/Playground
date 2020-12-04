def value(character):
  if character >= '0' and character <= '9':
    return ord(character) - ord('0')
  else:
    return ord(character) - ord('A') + 10
  
def convertToDec(string):
  strlen = len(string)
  power = 1 
  number = 0
  for i in range(strlen-1, -1, -1):
    number += value(string[i]) * power
    power *= 17
  return number
  
string = input()
print(convertToDec(string))