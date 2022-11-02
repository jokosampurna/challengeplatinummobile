@Register @Smoke
Feature: Register
	As a User, I want to register in secondhand store mobile app
	
#JokoSampurno.QA.Wave1.Binar
	
	@Reg001
	Scenario: Reg001 - User want to register using valid credential
		Then tap akun
		Then tap masuk
		Then tap pagedaftar
		Then input nama
		Then input email
		Then input password
		Then input hp
		Then input kota
		Then input alamat
		Then swipe
		Then tap daftar
		Then verify content profile
		Then close app
		
		@Reg002
	Scenario: Reg002 - User want to register using invalid credential
		Then start app
		Then tap akun
		Then tap masuk
		Then tap pagedaftar
		Then input nama1
		Then input email1
		Then input password1
		Then input hp1
		Then input kota1
		Then input alamat1
		Then swipe
		Then tap daftar 
		Then verify email
		Then close app
		
	@Reg003
	Scenario: Reg003 - User want to register using existing email
		Then start app
		Then tap akun
		Then tap masuk
		Then tap pagedaftar
		Then input nama2
		Then input email2
		Then input password2
		Then input hp2
		Then input kota2
		Then input alamat2
		Then swipe
		Then tap daftar 
		Then verify email sudah digunakan