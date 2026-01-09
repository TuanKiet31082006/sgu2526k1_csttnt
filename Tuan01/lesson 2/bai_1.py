# Khai bao thu vien
import math

# Nhap du lieu
x = float(input("Moi ban nhap bien so x: "))

# Xu ly
f_x = x + x ** 5 / math.factorial(5) + math.sqrt(abs(x)) / (x**(3/2))

# Xuat du lieu
print(f'Gia tri cua ham so f({x}) = {f_x:.2f}.')