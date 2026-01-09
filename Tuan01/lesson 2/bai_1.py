import math
x = float(input("Moi ban nhap bien so x: "))
f_x = x + x ** 5 / math.factorial(5) + math.sqrt(abs(x)) / (x**(3/2))
print(f'Gia tri cua ham so f({x}) = {f_x:.2f}.')