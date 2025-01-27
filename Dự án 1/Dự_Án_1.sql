USE [test_1]
GO
/****** Object:  Table [dbo].[color_SP]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[color_SP](
	[Id_Mau] [int] IDENTITY(1,1) NOT NULL,
	[color] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Mau] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChatLieu_SP]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu_SP](
	[Id_Cl] [int] IDENTITY(1,1) NOT NULL,
	[ChatLieu] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Cl] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DoiTra]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DoiTra](
	[Id_DoiTra] [int] IDENTITY(1,1) NOT NULL,
	[Id_NhanVien] [int] NOT NULL,
	[Id_KhachHang] [int] NOT NULL,
	[Id_SanPham] [int] NOT NULL,
	[Id_HDCT] [int] NOT NULL,
	[Id_HoaDon] [int] NOT NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [int] NULL,
	[DonGia] [money] NULL,
	[TrangThai] [bit] NULL,
	[NgayTao] [date] NULL,
	[TongTien] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_DoiTra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[Id_HoaDon] [int] IDENTITY(1,1) NOT NULL,
	[so] [int] NULL,
	[TrangThai] [bit] NULL,
	[NgayTao] [date] NULL,
	[SoTienGiam] [money] NULL,
	[TongTienThanhToan] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_HoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[Id_HDCT] [int] IDENTITY(1,1) NOT NULL,
	[TenCuaHang] [nvarchar](max) NULL,
	[Hotline] [nvarchar](10) NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [int] NULL,
	[Size] [varchar](5) NULL,
	[Color] [nvarchar](max) NULL,
	[DonGia] [money] NULL,
	[Id_NhanVien] [int] NULL,
	[Id_HoaDon] [int] NOT NULL,
	[TrangThai] [bit] NULL,
	[NgayTao] [date] NULL,
	[TongTien] [money] NULL,
	[iD_Voucher] [int] NULL,
	[Id_SanPham] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_HDCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[Id_KhachHang] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[SDT] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_KhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NVTT]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NVTT](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[iD_role] [int] NULL,
	[iD_nv] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanHang_SP]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanHang_SP](
	[Id_Nh] [int] IDENTITY(1,1) NOT NULL,
	[TenNhanHang] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Nh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[Id_NVien] [int] IDENTITY(1,1) NOT NULL,
	[Id_role] [int] NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[Email] [nvarchar](250) NULL,
	[SDT] [nvarchar](13) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Taikhoan] [nvarchar](20) NULL,
	[Matkhau] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_NVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[Id_role] [int] IDENTITY(1,1) NOT NULL,
	[chucVu] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_role] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[sanPham]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanPham](
	[IdSanPham] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](50) NULL,
	[Gia] [money] NULL,
	[MoTa] [nvarchar](200) NULL,
	[soLuong] [int] NULL,
	[Id_NhanHang] [int] NOT NULL,
	[Id_ChatLieu] [int] NOT NULL,
	[Id_Size] [int] NULL,
	[Id_Color] [int] NULL,
	[Hinh] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[IdSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[size_SP]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[size_SP](
	[Id_Sz] [int] IDENTITY(1,1) NOT NULL,
	[Size] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Sz] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[voucher]    Script Date: 08/08/2024 4:51:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[voucher](
	[Id_Voucher] [int] IDENTITY(1,1) NOT NULL,
	[TênVouvher] [nvarchar](max) NULL,
	[soTienGiam] [money] NULL,
	[DieuKien] [money] NULL,
	[NgayTao] [date] NULL,
	[NgayHetHan] [date] NULL,
	[SoLuong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Voucher] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[DoiTra] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[DoiTra] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT (N'Cửa Hàng ....') FOR [TenCuaHang]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT ('1900.5999') FOR [Hotline]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[voucher] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[DoiTra]  WITH CHECK ADD FOREIGN KEY([Id_HDCT])
REFERENCES [dbo].[HoaDonChiTiet] ([Id_HDCT])
GO
ALTER TABLE [dbo].[DoiTra]  WITH CHECK ADD FOREIGN KEY([Id_HoaDon])
REFERENCES [dbo].[HoaDon] ([Id_HoaDon])
GO
ALTER TABLE [dbo].[DoiTra]  WITH CHECK ADD FOREIGN KEY([Id_KhachHang])
REFERENCES [dbo].[KhachHang] ([Id_KhachHang])
GO
ALTER TABLE [dbo].[DoiTra]  WITH CHECK ADD FOREIGN KEY([Id_NhanVien])
REFERENCES [dbo].[NhanVien] ([Id_NVien])
GO
ALTER TABLE [dbo].[DoiTra]  WITH CHECK ADD FOREIGN KEY([Id_SanPham])
REFERENCES [dbo].[sanPham] ([IdSanPham])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([Id_HoaDon])
REFERENCES [dbo].[HoaDon] ([Id_HoaDon])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([Id_NhanVien])
REFERENCES [dbo].[NhanVien] ([Id_NVien])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([Id_SanPham])
REFERENCES [dbo].[sanPham] ([IdSanPham])
ON DELETE SET NULL
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD FOREIGN KEY([Id_role])
REFERENCES [dbo].[roles] ([Id_role])
GO
ALTER TABLE [dbo].[sanPham]  WITH CHECK ADD FOREIGN KEY([Id_Color])
REFERENCES [dbo].[color_SP] ([Id_Mau])
GO
ALTER TABLE [dbo].[sanPham]  WITH CHECK ADD FOREIGN KEY([Id_ChatLieu])
REFERENCES [dbo].[ChatLieu_SP] ([Id_Cl])
GO
ALTER TABLE [dbo].[sanPham]  WITH CHECK ADD FOREIGN KEY([Id_NhanHang])
REFERENCES [dbo].[NhanHang_SP] ([Id_Nh])
GO
ALTER TABLE [dbo].[sanPham]  WITH CHECK ADD FOREIGN KEY([Id_Size])
REFERENCES [dbo].[size_SP] ([Id_Sz])
GO
