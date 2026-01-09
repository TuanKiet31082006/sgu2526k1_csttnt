import random
def NhapMang():
    s = input("Moi ban nhap mang (cach nhau khoang trang): ")
    a = list(map(int, s.split()))
    return a

def XuatMang(a):
    print(f"Mang co {len(a)} phan tu:", end=" ")
    for x in a:
        print(x, end=" ")
    print()

def SinhNgauNhien(n, vmin=-10, vmax=10):
    a = []
    for _ in range(n):
        a.append(random.randint(vmin, vmax))
    return a

def DemTongChanLe(a):
    tong = 0
    sochan = 0
    sole = 0

    for x in a:
        tong += x
        if x % 2 == 0:
            sochan += 1
        else:
            sole += 1

    return tong, sochan, sole

def DayChanLe(a):
    achan = []
    ale = []

    for x in a:
        if x % 2 == 0:
            achan.append(x)
        else:
            ale.append(x)

    return achan, ale

# Nhập và xuất mảng
a = NhapMang()
XuatMang(a)

# Sinh mảng ngẫu nhiên
b = SinhNgauNhien(10, -10, 10)
XuatMang(b)

# Tính tổng, chẵn, lẻ
tong, chan, le = DemTongChanLe(b)
print(f"Tong = {tong}, So chan = {chan}, So le = {le}")

# Tách chẵn – lẻ
a_chan, a_le = DayChanLe(b)
print("Day chan:", a_chan)
print("Day le:", a_le)
