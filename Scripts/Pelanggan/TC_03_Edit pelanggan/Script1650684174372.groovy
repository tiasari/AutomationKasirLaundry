import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/Edit pelanggan/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Edit pelanggan/android.widget.Button - Edit Pelanggan'), 0)

Mobile.setText(findTestObject('Object Repository/Edit pelanggan/android.widget.EditText - Aurora'), 'Fatwari', 0)

Mobile.setText(findTestObject('Object Repository/Edit pelanggan/android.widget.EditText - 085697818108'), '081584198744', 
    0)

Mobile.setText(findTestObject('Object Repository/Edit pelanggan/android.widget.EditText - Jl. Merdeka Raya No.18'), 'Jl. Merdeka No.20', 
    0)

Mobile.tap(findTestObject('Object Repository/Edit pelanggan/android.widget.Button - Edit Pelanggan (1)'), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Edit pelanggan/android.widget.EditText - aurora (2)'), 'aurora', 0)

