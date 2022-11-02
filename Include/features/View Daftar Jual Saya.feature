@Daftarjualsaya @Smoke
Feature: View Daftar Jual Saya
	As a User, I want to view daftar jual saya in secondhand store mobile app
	
#JokoSampurno.QA.Wave1.Binar
	
	@PL001
	Scenario: PL001 - User want to view daftar jual saya menu semua produk
		Then call login
		Then tap daftar jual saya
		Then tap produk
		Then verify content
		Then close app
		
	@PL002
	Scenario: PL002 - User want to view daftar jual saya menu diminati
		Then start app
		Then call login
		Then tap daftar jual saya
		Then tap diminati
		Then verify content
		Then close app
		
	@PL003
	Scenario: PL003 - User want to view daftar jual saya menu terjual
		Then start app
		Then call login
		Then tap daftar jual saya
		Then tap terjual
		Then verify content