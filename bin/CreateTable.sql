CREATE TABLE SinhVien(
  IDSinhVien varchar2(10),
  TenSV varchar2(50),
  NgaySinh date,
  DiaChi varchar2(200),
  KhoaHoc varchar2(10),
  IDMon varchar2(10),
  IDNganh varchar2(10)
  );

CREATE TABLE HocKy(
  IDHocKy varchar2(10),
  IDSinhVien varchar2(10)
);

create table Khoa(
  IDKhoa varchar2(10),
  Khoa varchar2(50),
  IDNganh varchar2(10)
);

create table nganh(
  IDNganh varchar2(10),
  Nganh varchar2(50)
);

create table Mon(
  IDMon varchar2(10),
  Mon varchar2(50),
  IDDiem varchar2(10),
  IDSinhVien varchar2(10),
  IDKhoa Varchar2(10)
);

create table Diem(
  IDDiem varchar2(10),
  IDMon varchar2(10),
  DiemQT float,
  DiemHK float,
  DiemTB float
);
commit;
  