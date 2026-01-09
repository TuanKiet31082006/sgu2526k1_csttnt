# Nhap du lieu
n = int(input("Moi ban nhap so nguyen n: "))

# Xu ly
if n < 2:
    ngto = False
else:
    ngto = True
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            ngto = False
            break

# Xuat du lieu
if ngto == True:
    print(f'{n} la so nguyen to.')
else:
    print(f'{n} khong la so nguyen to.')
