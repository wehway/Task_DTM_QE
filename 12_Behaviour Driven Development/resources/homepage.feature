Feature: Halaman Utama LinkedIn
  As a user
  I want to login
  So I can see my dashboard page

  Scenario: Login Berhasil
    Given pengguna telah terdaftar dalam sistem
    When pengguna memasukkan username dan password yang valid
    Then pengguna berhasil masuk ke halaman beranda

  Scenario: Tampilan Profil
    Given pengguna telah masuk ke halaman beranda
    When pengguna mengklik menu "Profil"
    Then pengguna melihat halaman profilnya
