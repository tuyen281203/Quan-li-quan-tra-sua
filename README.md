# Quản Lý Quán Trà Sữa - Phúc Long (Java Swing)

Dự án này là một ứng dụng quản lý quán trà sữa được xây dựng bằng **Java Swing**. Ứng dụng cung cấp các chức năng cơ bản để quản lý nhân viên, sản phẩm, đơn hàng, và doanh thu.

## 📚 Tính năng chính
- **Quản lý nhân viên**: Thêm, sửa, xóa và xem thông tin nhân viên.
- **Quản lý sản phẩm**: Quản lý danh mục đồ uống và nguyên liệu.
- **Quản lý đơn hàng**: Xử lý đơn hàng, in hóa đơn và lưu trữ lịch sử giao dịch.
- **Thống kê doanh thu**: Tổng hợp báo cáo doanh thu theo ngày, tháng, năm.
- **Sao lưu và phục hồi dữ liệu**: Backup dữ liệu sang file SQL.

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ**: Java
- **Giao diện**: Java Swing
- **Cơ sở dữ liệu**: MySQL
- **Công cụ**: Apache Netbeans

## 📂 Cấu trúc dự án
```plaintext
Quan-li-quan-tra-sua/
├── src/main/               # Mã nguồn chính của ứng dụng
│   ├── java/               # Thư mục chứa code Java
│   ├── resources/          # Tài nguyên (icon, file cấu hình)
├── backup-10-01-2021.sql   # Tệp sao lưu cơ sở dữ liệu
├── pom.xml                 # Tệp cấu hình Maven
├── licenseheader.txt       # Thông tin bản quyền
└── README.md               # Mô tả dự án
