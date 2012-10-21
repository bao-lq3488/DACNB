

use QuanLySinhVien
alter table SinhVien add MaSV int not null primary key
alter table Sach add MaSach int not null primary key
alter table MuonSach add MaMuon int not null primary key
alter table MuonSach add constraint MuonSach_MaSV_FK foreign key(MaSV) references SinhVien(MaSV)
alter table MuonSach add constraint MuonSach_MaMuon_FK foreign key(MaSach) references Sach(MaSach)




