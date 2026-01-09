# Nhap du lieu
n = int(input("Moi ban nhap so nguyen n: "))

# Xuat du lieu
s = 0

for i in range(2, n + 1, 2):
    s += i
    
print(f'Tong cac so chan tu 1 den {n} la {s}')