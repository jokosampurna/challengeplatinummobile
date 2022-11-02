@Login @Smoke
Feature: Login
	As a User, I want to Login in secondhand store mobile app
	
#Agungcahyadi.QA.Wave1.Binar

			@Log005
	Scenario: Log001 - User want to login using valid credential
		Then tap akun
		Then tap masuk
		Then input email 
		Then input password
		Then tap masuk login
		Then verify content
		Then close app