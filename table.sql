use QuanLySinhVien

create table SinhVien(
MaSV int, ---primary key(MaSV)
HoTenSV nvarchar(50),
Tuoi tinyint,
GioiTinh bit null,
)

create table Sach(
MaSach int,-- primary key(MaSach)
TenSach nvarchar(50),
LoaiSach nvarchar(50),
DanhGia nvarchar(20)
)

create table MuonSach(
MaMuon int,
MaSV int,
MaSach int,
ThoiGianMuon datetime,
--primary key(MaMuon)
--constraint MuonSach_MaSV_FK foreign key(MaSV) references SinhVien(MaSV),
--constraint MuonSach_MaMuon_FK foreign key(MaMuon) references Sach(MaSach)
)