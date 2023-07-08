package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("pengguna telah terdaftar dalam sistem")
    public void penggunaTelahTerdaftarDalamSistem() {
        System.out.println("Pengguna telah terdaftar dalam sistem");
    }

    @When("pengguna memasukkan username dan password yang valid")
    public void penggunaMemasukkanUsernameDanPasswordYangValid() {
        System.out.println("pengguna memasukkan username dan password yang valid");
    }

    @Then("pengguna berhasil masuk ke halaman beranda")
    public void penggunaBerhasilMasukKeHalamanBeranda() {
        System.out.println("pengguna berhasil masuk ke halaman beranda");
    }

    @Given("pengguna telah masuk ke halaman beranda")
    public void penggunaTelahMasukKeHalamanBeranda() {
        System.out.println("pengguna telah masuk ke halaman beranda");
    }

    @When("pengguna mengklik menu {string}")
    public void penggunaMengklikMenu(String arg0) {
        System.out.println("pengguna mengklik menu Profil");
    }

    @Then("pengguna melihat halaman profilnya")
    public void penggunaMelihatHalamanProfilnya() {
        System.out.println("pengguna melihat halaman profilnya");
    }
}
