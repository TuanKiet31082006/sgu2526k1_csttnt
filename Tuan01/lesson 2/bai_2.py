# Khai bao thu vien
import math

# Nhap du lieu
t= int(input("Nhap vao tong so giay: "))

# Xu ly
hh = t // 3600
mm = (t % 3600) // 60
ss = t % 60

# Xuat du lieu
print(f'{t} giay co dang {hh}:{mm}:{ss}')