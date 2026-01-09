# Xử lý không trùng
def XuLyKhongTrung(a):
    s = set()
    for x in a:
        s.add(x)
    return sorted(s)

# Đếm số lần xuất hiện
def DemSoLanXuatHien(a):
    dem = {}
    for x in a:
        if x in dem:
            dem[x] += 1
        else:
            dem[x] = 1
    return dem

# Kiểm tra
a = ['A', 'G', 'C', 'A', 'C', 'F', 'F', 'T', 'H']

b = XuLyKhongTrung(a)
print(b)  

c = DemSoLanXuatHien(a)
print(c) 
